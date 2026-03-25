class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[]dp=new Boolean[s.length()];
        return solve(s,wordDict,0,dp);
        
    }
    public boolean solve(String s,List<String>wordDict,int idx,Boolean[]dp){
        if(idx==s.length())return true;
        if(dp[idx]!=null)return dp[idx];

        for(int i=idx+1;i<=s.length();i++){
            String ans=s.substring(idx,i);
            if(wordDict.contains(ans)){
                if(solve(s,wordDict,i,dp)){
                    return dp[idx]=true;
                }
            }
        }
        return dp[idx]= false;
    }
}