class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        mp.put(0,1);
        int sum=0;
        int ans=0;
        for(int num:nums){
            sum+=num;
            int rem=((sum%k)+k)%k;
            if(mp.containsKey(rem)){
                ans+=mp.get(rem);
            }
            mp.put(rem,mp.getOrDefault(rem,0)+1);
        }
        return ans;
        
    }
}