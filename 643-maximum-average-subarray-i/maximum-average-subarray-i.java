class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int  sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int max=sum;
        int i=0,j=k-1;
        while(j<nums.length-1){
            sum-=nums[i];
            i++;j++;
            sum+=nums[j];
            max=Math.max(max,sum);
        }
        return (double)max/k;
    
        
    }
}