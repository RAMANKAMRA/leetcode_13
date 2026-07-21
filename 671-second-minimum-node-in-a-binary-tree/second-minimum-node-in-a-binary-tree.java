class Solution {

    long ans = Long.MAX_VALUE;
    int min;

    public int findSecondMinimumValue(TreeNode root) {

        min = root.val;

        dfs(root);

        return ans == Long.MAX_VALUE ? -1 : (int) ans;
    }

    void dfs(TreeNode root) {

        if (root == null)
            return;

        if (root.val > min) {
            ans = Math.min(ans, root.val);
            return;
        }

        dfs(root.left);
        dfs(root.right);
    }
}