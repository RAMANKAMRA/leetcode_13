class Solution {
     int[][]dp;
    public boolean canPartition(int[] nums) {
        int n = nums.length;
    
        int total = 0;

        for (int x : nums) total += x;

        if ((total & 1) == 1) return false;

        int target = total / 2;
        dp=new int[n][target+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }

        return solve(0, nums, n, target);
    }

    public boolean solve(int index, int[] nums, int n, int target) {

        if (target == 0) return true;       
        if (index >= n) return false;      
        if (target < 0) return false;  
        if(dp[index][target]!=-1)return dp[index][target]==1;     

        boolean include = solve(index + 1, nums, n, target - nums[index]);
        boolean exclude = solve(index + 1, nums, n, target);
         boolean result = include || exclude;
        dp[index][target] = result ? 1 : 0;

        return result;

    }
}
