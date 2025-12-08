class Solution {
    int[][]dp;
    public int minSwap(int[] nums1, int[] nums2) {
        int n=nums1.length;
        dp=new int[n][2];
        for (int i = 0; i < n; i++) {
            dp[i][0] = -1;
            dp[i][1] = -1;
        }

        return solve(nums1,nums2,0,0);

 }
 public int solve(int[]nums1,int[]nums2,int index,int swapped){
    if(index==nums1.length)return 0;
    if (dp[index][swapped]!= -1)
            return dp[index][swapped];

    int ans=Integer.MAX_VALUE;
    int prev1=(index==0)?-1:nums1[index-1];
    int prev2=(index==0)?-1:nums2[index-1];
      if (swapped == 1) {
            int temp = prev1;
            prev1 = prev2;
            prev2 = temp;
        }
 
    if(nums1[index]>prev1&&nums2[index]>prev2){
        ans=solve(nums1,nums2,index+1,0);
    }
    if(nums1[index]>prev2&&nums2[index]>prev1){
        ans=Math.min(ans,1+solve(nums1,nums2,index+1,1));
    }
    return dp[index][swapped]=ans;
 }
}