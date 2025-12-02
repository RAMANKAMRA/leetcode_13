class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        if(n==2)return Math.max(nums[0],nums[1]);
        int[]dp1=new int[n];
        int[]dp2=new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        int case1=solve(n-2,nums,0,dp1);
        int case2=solve(n-1,nums,1,dp2);
        return Math.max(case1,case2);
        
    }
    public int solve(int i,int[]nums,int start,int[]dp){
        if(i<start)return 0;
        if(i==start)return nums[i];

        if(dp[i]!=-1)return dp[i];
        int pick=nums[i]+solve(i-2,nums,start,dp);
        int notpick=solve(i-1,nums,start,dp);
        return dp[i]=Math.max(pick,notpick);

    }
}