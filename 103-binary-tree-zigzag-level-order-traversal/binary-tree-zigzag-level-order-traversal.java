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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> leveled = levelOrder(root);
        for(int i = 0 ; i<leveled.size() ; i++){
            if(i%2==1 && !leveled.get(i).isEmpty()){
                Collections.reverse(leveled.get(i));
            }
        }
        return leveled;
    }
    List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        traversal(root, 0 ,res);
        return res;
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