class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int i=0;
        int j=0;
        int count=0;
        while(i<n&&j<n){
            if(nums[j]>nums[i]){
                count++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        return count;
        

    }
}