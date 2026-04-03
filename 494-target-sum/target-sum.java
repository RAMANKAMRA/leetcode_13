class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums,0,target);
        
    }
    public int solve(int[]nums,int i,int target){
        if(i==nums.length){
      if(target==0)return 1;
      return 0;
        }
      int add=solve(nums,i+1,target-nums[i]);
      int sub=solve(nums,i+1,target+nums[i]);
      return add+sub;

    }
}