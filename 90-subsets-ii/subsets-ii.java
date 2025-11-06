class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>>set=new HashSet<>();
        List<Integer>current=new ArrayList<>();
        generateSubsets(0,nums,current,set);
        return new ArrayList<>(set);
    }
    void generateSubsets(int index,int[]nums,List<Integer>current,Set<List<Integer>>set){
        if(index==nums.length){
            set.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        generateSubsets(index+1,nums,current,set);
        current.remove(current.size()-1);
        generateSubsets(index+1,nums,current,set);
    }
}