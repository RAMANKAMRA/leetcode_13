class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer>map=new HashSet<>();
        int max=-1;
        for(int num:nums){
            map.add(num);
        }
        for(int num:nums){
            if(num>0&&map.contains(-num)){
                max=Math.max(max,num);

            }
        }
        return max;
        
    }
}