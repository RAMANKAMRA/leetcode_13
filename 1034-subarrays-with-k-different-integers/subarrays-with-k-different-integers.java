class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
    public int atmost(int[]nums,int k){
        int n=nums.length;
        int left=0;
        int ans=0;
          HashMap<Integer,Integer>mp=new HashMap<>();
        for(int right=0;right<n;right++){
           mp.put(nums[right],mp.getOrDefault(nums[right],0)+1);
           while(mp.size()>k){
            mp.put(nums[left],mp.get(nums[left])-1);
            if(mp.get(nums[left])==0){
                mp.remove(nums[left]);

            }
            left++;
           }
           ans+=(right-left+1);


        }
        return ans;

    }
}