class Solution {
    public int longestBalanced(String s) {
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer>mp=new HashMap<>();
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                mp.put(ch,mp.getOrDefault(ch,0)+1);
                HashSet<Integer>set=new HashSet<>(mp.values());
                if(set.size()==1){
                    maxlen=Math.max(maxlen,j-i+1);
                }
            }

        }
        return maxlen;
        
    }
}