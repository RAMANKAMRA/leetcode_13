class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int x=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                x=Math.min(x,Math.abs(i-start));
            }
        }
        return x;
        
    }
}