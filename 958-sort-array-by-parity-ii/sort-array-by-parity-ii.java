class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        int evenidx=0;
        int oddidx=1;
        for(int x:nums){
            if(x%2==0){
                result[evenidx]=x;
                evenidx+=2;
            }else{
                result[oddidx]=x;
                oddidx+=2;
            }
        }
        return result;
        
    }
}