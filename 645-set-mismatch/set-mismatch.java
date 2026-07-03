class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int sum=0;
        int duplicate=-1;
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                duplicate=num;
            }else{
                set.add(num);
                sum+=num;
            }
        }
        int asum=n*(n+1)/2;
        int missing=asum-sum;
        return new int[]{duplicate,missing};

        
    }
}