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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        int sub  = targetSum - root.val;
        if(sub == 0 && root.left == null && root.right == null){
            return true;
        }
        boolean l=false, r = false;
        if(root.left != null){
            l = hasPathSum(root.left, sub);}
        if(root.right != null){
            r = hasPathSum(root.right, sub);}
        return l || r;
    }
}