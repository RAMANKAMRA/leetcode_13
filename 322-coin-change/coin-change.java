class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);

        int ans = solve(coins, amount, dp);

        return ans >= Integer.MAX_VALUE / 2 ? -1 : ans;
    }

    public int solve(int[] coins, int amount, int[] dp) {
        if (amount == 0) return 0;
        if (amount < 0) return Integer.MAX_VALUE /2;

        if (dp[amount] != -1) return dp[amount];

        int min = Integer.MAX_VALUE /2;

        for (int coin : coins) {
            int res = solve(coins, amount - coin, dp); 
            min = Math.min(min, res + 1);
        }

        return dp[amount] = min;
    }
}
