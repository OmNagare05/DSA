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

    Stack <TreeNode> s1 =  new Stack<>();
    Stack <TreeNode> s2 = new Stack<>();

    TreeNode getSmall(){

        if(s1.isEmpty()){
            return null;
        }
        TreeNode small = s1.peek();
        s1.pop();
        TreeNode rightchild = small.right;
        while(rightchild != null){
            s1.push(rightchild);
            rightchild = rightchild.left;
        }
        return small;

    }

   TreeNode getBig(){
    if(s2.isEmpty()){
        return null;
    }

    TreeNode big = s2.peek();
    s2.pop();
    TreeNode leftchild = big.left;

    while(leftchild != null){
        s2.push(leftchild);
        leftchild = leftchild.right;
    }
    return big;
   }

    public boolean findTarget(TreeNode root, int k) {

        if(root == null){
            return false;
        }

        TreeNode t = root;

        while(t != null){
            s1.push(t);
            t = t.left;
        }
        t = root;

        while(t != null){
            s2.push(t);
            t = t.right;
        }


         TreeNode i = getSmall();
         TreeNode j = getBig();
        while(i != j){
            int sum = i.val + j.val;
            if(sum == k){
                return true;
            }
            else if(sum < k){
                i = getSmall();
            }
            else{
                j = getBig();
            }

        }
        return false;

        
    }
}