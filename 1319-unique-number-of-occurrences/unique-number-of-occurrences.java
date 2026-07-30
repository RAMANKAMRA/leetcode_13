class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int num:arr){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        Set<Integer>st=new HashSet<>(mp.values());
        return st.size()==mp.size();
        
    }
}