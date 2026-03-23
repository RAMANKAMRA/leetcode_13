class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
            if (isequal(mat,target)){
                return true;
            }
            mat=rotate(mat);
        }
        return false;
        
    }
    private int[][] rotate(int[][] mat){
        int n=mat.length;
        int[][]rotated=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rotated[i][j]=mat[n-j-1][i];
            }
        } 
        return rotated;
    
    }
    private boolean isequal(int[][]a,int[][]b){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]!=b[i][j]){
                    return false;
                
                }
            }
        }
        return true;
    


    }

    
} 