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

    List<Integer> inp = new ArrayList<>();
    List<Integer> inq = new ArrayList<>();
    List<Integer> prep = new ArrayList<>();
    List<Integer> preq = new ArrayList<>();
    List<Integer> postp = new ArrayList<>();
    List<Integer> postq = new ArrayList<>();

    List<Integer> inorderTraversal(TreeNode a){
        if(a==null){
            inp.add(0);
            return new ArrayList<>();
        }
        inorderTraversal(a.left);
        inp.add(a.val);
        inorderTraversal(a.right);
        return inp;

    }

    List<Integer> inorderTraversal1(TreeNode a){
        if(a==null){
            inq.add(0);
            return new ArrayList<>();
        }
        inorderTraversal1(a.left);
        inq.add(a.val);
        inorderTraversal1(a.right);
        return inq;

    }

    List<Integer> preorderTraversal(TreeNode a){
        if(a==null){
            prep.add(0);
            return new ArrayList<>();
        }
        prep.add(a.val);
        preorderTraversal(a.left);
        preorderTraversal(a.right);
        return prep;
    
    }
    List<Integer> preorderTraversal1(TreeNode a){
        if(a==null){

            preq.add(0);
            return new ArrayList<>();

        }
        preq.add(a.val);
        preorderTraversal1(a.left);
        preorderTraversal1(a.right);
        return preq;
    }

    List<Integer> postorderTraversal(TreeNode a){
        if(a==null){
            postp.add(0);
            return new ArrayList<>();
        }
        
        postorderTraversal(a.left);
        postorderTraversal(a.right);
        postp.add(a.val);

        return postp;
    }

    List<Integer> postorderTraversal1(TreeNode a){
        if(a==null){
            
        postq.add(0);
            return new ArrayList<>();
        }
        
        postorderTraversal1(a.left);
        postorderTraversal1(a.right);
        postq.add(a.val);

        return postq;
    }



    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> p1 = inorderTraversal(p);
        List<Integer> p2 = inorderTraversal1(q);
        List<Integer> p11 = preorderTraversal(p);
        List<Integer> p22 = preorderTraversal1(q);
        List<Integer> p111 = postorderTraversal(p);
        List<Integer> p222 = postorderTraversal1(q);
        return p1.equals(p2) && p11.equals(p22) && p111.equals(p222);
    }
}