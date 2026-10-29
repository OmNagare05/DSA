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
    public boolean isCompleteTree(TreeNode root) {

        boolean nullFound = false;

        if(root == null){
            return true;
        }

        Queue<TreeNode> q1 = new LinkedList<>();
        q1.add(root);

        while(!q1.isEmpty()){
            TreeNode t = q1.peek();
            q1.remove();

            if(t == null){
                nullFound = true;
            }else{
                if(nullFound == true){
                    return false;
                }
               q1.add(t.left);
               q1.add(t.right);

            }
            
        }
        return true;
        
    }
}