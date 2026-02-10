class Solution {
    public int minRemoval(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int left=0;
        int max=1;
        for(int right=0;right<n;right++){
            while((long)nums[right]>(long)nums[left]*k){
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return n-max;
        
    }
}