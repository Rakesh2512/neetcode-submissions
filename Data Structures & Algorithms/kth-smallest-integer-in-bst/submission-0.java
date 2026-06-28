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
    public void preOrder(PriorityQueue<Integer>pq,TreeNode root){

        if(root == null){
            return;
        }
        pq.add(root.val);
        preOrder(pq,root.left);
        preOrder(pq,root.right);

    }
    public int kthSmallest(TreeNode root, int k) {
        if(root == null){
            return 0;
        }

        PriorityQueue<Integer>pq = new PriorityQueue<>();
        preOrder(pq,root);
        while(k > 1){
            pq.poll();
            k--;
        }
        return pq.peek();
    }
}
