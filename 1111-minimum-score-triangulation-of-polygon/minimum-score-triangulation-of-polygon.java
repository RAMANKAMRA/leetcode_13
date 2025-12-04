class Solution {
    int dp[][];

    public int minScoreTriangulation(int[] values) {
        int n=values.length;
        dp=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        
        return solve(values,0,n-1);
        

    }
    public int solve(int[]values,int i,int j){
        if(i+1==j)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int ans=Integer.MAX_VALUE;
        for(int k=i+1;k<j;k++){
            ans=Math.min(ans,(values[i]*values[j]*values[k])+solve(values,i,k)+solve(values,k,j));

        }
       dp[i][j]=ans;
       return ans;

    }
}