class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i-1>=0){
                    grid[i][j]+=grid[i-1][j];
                }
                if(j-1>=0){
                    grid[i][j]+=grid[i][j-1];
                }
                if(i-1>=0&&j-1>=0){
                    grid[i][j]-=grid[i-1][j-1];
                }

                if(grid[i][j]<=k)count++;
                else break;
            }
        }
        return count;
        
        
    }
}