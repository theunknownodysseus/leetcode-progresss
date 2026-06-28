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
    public int search(int[] inorder, int left , int right , int target){
        for(int i = left;i <= right ; i++){
            if(target == inorder[i]){
                return i;
            }
        }
        return -1;
    }
    public TreeNode buildhelp(int[] inorder,int [] preorder, int[] preindex , int left , int right){
        if(left>right){
            return null;
        }
        int rootval = preorder[preindex[0]];
        preindex[0]++;
        TreeNode root = new TreeNode(rootval);
        int index = search(inorder, left, right, rootval);
        root.left = buildhelp(inorder , preorder,preindex , left , index-1);
        root.right = buildhelp(inorder , preorder, preindex , index+1 , right);

        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preindex[] = {0};
        return buildhelp(inorder, preorder, preindex , 0 , preorder.length-1);
    }
}