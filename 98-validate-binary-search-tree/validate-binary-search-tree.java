/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public boolean isValidBST(TreeNode root) {
        return isValidate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidate(TreeNode root, long min, long max) {

       

        if (root.val <= min || root.val >= max)
            return false;
            boolean left=true;
            boolean right=true;
            if(root.left!=null)left=isValidate(root.left, min, root.val);
            if(root.right!=null)right=isValidate(root.right, root.val, max);

        return left&&right;
            
    }
}