class Solution {

    Integer[][] dp;

    public int solve(int[] nums, int curr, int prev) {
        int n = nums.length;

        if (curr == n) return 0;

        if (dp[curr][prev + 1] != null) 
            return dp[curr][prev + 1];

        int take = 0;
        if (prev == -1 || nums[curr] > nums[prev]) {
            take = 1 + solve(nums, curr + 1, curr);
        }

        int nottake = solve(nums, curr + 1, prev);

        return dp[curr][prev + 1] = Math.max(take, nottake);
    }

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        dp = new Integer[n][n + 1];   
        return solve(nums, 0, -1);
    }
}
