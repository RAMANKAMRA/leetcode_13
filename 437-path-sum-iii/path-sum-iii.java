class Solution {

    public int pathSum(TreeNode root, int targetSum) {

        if (root == null)
            return 0;

        return count(root, targetSum)
                + pathSum(root.left, targetSum)
                + pathSum(root.right, targetSum);
    }

    private int count(TreeNode root, long targetSum) {

        if (root == null)
            return 0;

        int ans = 0;

        if (root.val == targetSum)
            ans++;

        ans += count(root.left, targetSum - root.val);
        ans += count(root.right, targetSum - root.val);

        return ans;
    }
}