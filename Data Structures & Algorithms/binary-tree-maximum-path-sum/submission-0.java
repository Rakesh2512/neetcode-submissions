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
    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return res;
    }

    public int getMax(TreeNode root){
        if(root == null){
            return 0;
        }

        int l = getMax(root.left);
        int r = getMax(root.right);

        int path = root.val + Math.max(l,r);
        return Math.max(0,path);
    }

    public void dfs(TreeNode root){
        if(root == null){
            return;
        }
        int l = getMax(root.left);
        int r = getMax(root.right);

        res = Math.max(res,root.val+l+r);
        dfs(root.left);
        dfs(root.right);
    }    
}
