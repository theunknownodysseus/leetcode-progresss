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
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        traversal(root, 0 ,res);
        List<Integer> fin = new ArrayList<>();
        for(List<Integer> i : res){
            fin.add(i.get(i.size()-1));
        }
        return fin;
    }
    void traversal(TreeNode root , int level , List<List<Integer>> res){
        if(root == null) return;
        if(res.size()<=level){
            res.add(new ArrayList());
        }
        res.get(level).add(root.val);
        traversal(root.left , level+1 , res);
        traversal(root.right , level+1 , res);
        
    }
}