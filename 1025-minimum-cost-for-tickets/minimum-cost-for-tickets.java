class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        int[]dp=new int[n];
        Arrays.fill(dp,-1);

        return solve(n, days, costs, 0,dp);
    }

    public int solve(int n, int[] days, int[] costs, int index,int[]dp) {
        if (index >= n) return 0;
        if(dp[index]!=-1)return dp[index];

        int option1 = costs[0] + solve(n, days, costs, index + 1,dp);
        int next7 = index;
        for (int i = index; i < n && days[i] < days[index] + 7; i++) {
            next7 = i + 1;
        }
        int option2 = costs[1] + solve(n, days, costs, next7,dp);
        int next30 = index;
        for (int i = index; i < n && days[i] < days[index] + 30; i++) {
            next30 = i + 1;
        }
        int option3 = costs[2] + solve(n, days, costs, next30,dp);

  
        return dp[index]=Math.min(option1, Math.min(option2, option3));
    }
 
}
