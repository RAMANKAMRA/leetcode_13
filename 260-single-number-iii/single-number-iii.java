class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        int[]ans=new int[2];
        int i=0;
        for(int key:mp.keySet()){
            if(mp.get(key)==1){
                ans[i++]=key;
            }
            
            
        }
        return ans;
    }
}