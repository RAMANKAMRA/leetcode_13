class Solution {
    static int dp[][];
    public int maximalSquare(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        dp=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        int maxside=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int side=solve(matrix,i,j);
                maxside=Math.max(maxside,side);
            }
        }
        return maxside*maxside;
        
    }
    public int solve(char[][]matrix,int i,int j){
        if(i>=matrix.length||j>=matrix[0].length)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        int right=solve(matrix,i,j+1);
        int diagonal=solve(matrix,i+1,j+1);
        int down=solve(matrix,i+1,j);
        if(matrix[i][j]=='1'){
            dp[i][j]=1+Math.min(right,Math.min(diagonal,down));

        }else{
            dp[i][j]=0;
        }
            
        return dp[i][j];

    }
}