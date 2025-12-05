class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int total = 0;
        for (int x : nums) total += x;

        int leftSum = 0;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            leftSum += nums[i];
            int rightSum = total - leftSum;

            if ((leftSum - rightSum) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
