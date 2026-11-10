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
    HashMap <Integer , Integer> hm = new HashMap<>();
     int indx;
   
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
      indx = postorder.length-1;

      for(int i=0; i<postorder.length; i++){
        
         hm.put(inorder[i] , i);

      }

      return fun(postorder , 0 , postorder.length-1);
      

    }
    
    TreeNode fun(int postorder[] , int low , int high){
       

        if(low > high){
            return null;
        }

        TreeNode node = new TreeNode(postorder[indx]);
        indx--;

        int id = hm.get(node.val);

        node.right = fun(postorder , id+1 , high);
        node.left = fun(postorder , low , id-1);

        return node;

    }
}