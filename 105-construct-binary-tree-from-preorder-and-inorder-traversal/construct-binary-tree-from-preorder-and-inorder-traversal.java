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
    int indx = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        

        for(int i=0; i<inorder.length; i++){
            hm.put(inorder[i] , i);
        }

        return fun(preorder , 0 , inorder.length-1);
    }
   
    TreeNode fun(int [] preorder , int low , int high ){

        if(low > high){
            return null;
        }
        TreeNode node = new TreeNode(preorder[indx]);
        indx++;

        int id = hm.get(node.val);

        node.left = fun(preorder , low, id-1);
        node.right = fun(preorder , id+1 , high);

        return node;
    }
}