
class Solution {
    int dp[][];
    public int minSideJumps(int[] obstacles) {
        int n=obstacles.length;
        dp=new int[4][n];
        for(int i=0;i<=3;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(2,0,obstacles);
        
    }
    public int solve(int lane,int pos,int[]obstacles){
        int n=obstacles.length;
        if(pos==obstacles.length-1)return 0;
        if(dp[lane][pos]!=-1)return dp[lane][pos];

        int ans=Integer.MAX_VALUE;
        if(obstacles[pos+1]!=lane){
            ans=solve(lane,pos+1,obstacles);
        }else{
        for(int newlane=1;newlane<=3;newlane++){
            if(newlane!=lane&&obstacles[pos]!=newlane){
                ans=Math.min(ans,1+solve(newlane,pos,obstacles));

            }
        }
    }
    dp[lane][pos]=ans;
   
    return ans;
    }
}