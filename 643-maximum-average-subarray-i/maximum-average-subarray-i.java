class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int sum = 0;


        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int max = sum;

        for (int i = 0, j = k - 1; j < nums.length - 1; i++, j++) {
            sum -= nums[i];      // Left element remove
            sum += nums[j + 1];  // Next element add
            max = Math.max(max, sum);
        }

        return (double) max / k;
    }
}