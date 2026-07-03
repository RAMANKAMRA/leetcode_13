class Solution {
    public int firstMissingPositive(int[] nums) {
        int x=1;
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int i:set){
           if(set.contains(x)){
            x++;
           } 
        }
        return x;
    }
}