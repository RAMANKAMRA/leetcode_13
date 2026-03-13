class Solution {
    public String longestPrefix(String s){
        int[]lps=new int[s.length()];
        int pre=0;
        int suf=1;
        while(suf<s.length()){
            if(s.charAt(pre)==s.charAt(suf)){
                lps[suf]=pre+1;
                suf++;pre++;
            }else{
                if(pre==0){
                    lps[suf]=0;
                    suf++;
                }else{
                    pre=lps[pre-1];
                }
            }
        }
        return s.substring(0,lps[s.length()-1]);
        
    }
}