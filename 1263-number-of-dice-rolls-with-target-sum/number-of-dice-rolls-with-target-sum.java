class Solution {
    Integer[][]dp;
 static final int MOD = 1000000007;
    public int numRollsToTarget(int n, int k, int target) {
        dp=new Integer[n+1][target+1];
        return solve(n,k,target);
        
    }
    public int solve(int dices,int faces,int target){
        if(dices==0&&target==0)return 1;
        if(dices==0||target<0)return 0;
        if (dp[dices][target] != null) return dp[dices][target];
        
        long ans=0;
        for(int i=1;i<=faces;i++){
            ans+=solve(dices-1,faces,target-i);
            ans%=MOD;
        }
        return dp[dices][target]= (int)ans;

    }
}
