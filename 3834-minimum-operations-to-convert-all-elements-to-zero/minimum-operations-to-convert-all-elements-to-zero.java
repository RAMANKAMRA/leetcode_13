class Solution {
    public int minOperations(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
 for (int num : nums) {
    
            if (num == 0) {
                stack.clear();
                continue;
            }
            
            while (!stack.isEmpty() && stack.peek() > num) {
                stack.pop();
            }
            if (stack.isEmpty() || stack.peek() < num) {
                res++;
                stack.push(num);
            }
        }

        return res;
    }
}
