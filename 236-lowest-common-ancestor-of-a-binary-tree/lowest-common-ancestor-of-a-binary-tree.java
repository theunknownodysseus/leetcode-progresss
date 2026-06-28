/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }

        if(root == p || root == q){
            return root;
        }

        TreeNode leftca = lowestCommonAncestor(root.left, p,q);
        TreeNode rightca = lowestCommonAncestor(root.right, p,q);

        if(leftca != null && rightca != null){
            return root;
        }

        return leftca!= null ? leftca : rightca;
    }
}