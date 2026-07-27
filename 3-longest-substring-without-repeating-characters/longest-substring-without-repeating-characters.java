class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>ans=new HashSet<>();
        int left=0;
        int right=0;
        int maxlen=0;
        while(right<s.length()){
            char c=s.charAt(right);
            if(!ans.contains(c)){
                ans.add(c);
                maxlen=Math.max(maxlen,right-left+1);
                right++;
            }else{
              ans.remove(s.charAt(left));
              left++;  
            }
        }
        return maxlen;
        
        
    }
}