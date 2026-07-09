class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        solve(0, nums, ans);
        return ans;
    }

    void solve(int index, int[] nums, List<List<Integer>> ans) {

        if (index == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int x : nums)
                temp.add(x);

            ans.add(temp);
            return;
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = index; i < nums.length; i++) {

            // Same recursion level par duplicate value ko skip karo
            if (set.contains(nums[i]))
                continue;

            set.add(nums[i]);

            swap(nums, index, i);

            solve(index + 1, nums, ans);

            swap(nums, index, i);
        }
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}