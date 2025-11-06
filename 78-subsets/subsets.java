import java.util.*;

class Solution {

    void func(int ind, int[] nums, List<Integer> curr, List<List<Integer>> result) {
        if (ind == nums.length) {
            result.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[ind]);
        func(ind + 1, nums, curr, result);

        curr.remove(curr.size() - 1);
        func(ind + 1, nums, curr, result);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        func(0, nums, new ArrayList<>(), result);
        return result;
    }
}