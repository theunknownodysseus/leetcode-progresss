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

    
    int height = 0;
    public int maxheight(TreeNode curr){
        if(curr == null){
            return 0;
        }
        if(curr.left == null && curr.right == null){
            return 1;
        }
        return Math.max(maxheight(curr.left)+1,maxheight(curr.right)+1);
    }

    public void traverse(TreeNode curr){
        if(curr==null){
            return;
        }
        traverse(curr.left);
        height = Math.max(height,(maxheight(curr.left) + maxheight(curr.right)));
        traverse(curr.right);

    }

    public int diameterOfBinaryTree(TreeNode root) {
        TreeNode curr = root;
        traverse(curr);
        return height;
    }
}