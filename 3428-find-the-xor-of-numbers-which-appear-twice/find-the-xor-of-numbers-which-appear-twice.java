class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        int ans=0;
        for(int key:mp.keySet()){
            if(mp.get(key)==2){
                ans^=key;
            }
        }
        return ans;
        
    }
}