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
    public int BalancedHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int l = BalancedHeight(root.left);
        int r = BalancedHeight(root.right);

        return Math.max(l,r)+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }

        int left =  BalancedHeight(root.left);
        int right = BalancedHeight(root.right);

        if((Math.abs(left-right) <= 1) && isBalanced(root.left) && isBalanced(root.right)){
            return true;
        }
        return false;
    }
}
