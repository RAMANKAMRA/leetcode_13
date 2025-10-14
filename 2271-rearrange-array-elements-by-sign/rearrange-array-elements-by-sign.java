class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int pi=0;
        int ni=1;
        int[]ans=new int[n];
        for(int num:nums){
            if(num>0){
                ans[pi]=num;
                pi+=2;
            }else if(num<0){
                ans[ni]=num;
                ni+=2;
            }
        }
        return ans;
        
    }
}