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

    public TreeNode split(int[] pre, Map<Integer,Integer> inord,
                          int rootIndex, int l, int r) {

        // Base condition
        if(l > r) {
            return null;
        }

        TreeNode root = new TreeNode(pre[rootIndex]);

        int mid = inord.get(pre[rootIndex]);

        int leftSize = mid - l;

        // Build left subtree
        root.left = split(pre, inord,
                          rootIndex + 1,
                          l,
                          mid - 1);

        // Build right subtree
        root.right = split(pre, inord,
                           rootIndex + leftSize + 1,
                           mid + 1,
                           r);

        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        Map<Integer,Integer> InOrder = new HashMap<>();

        for(int i = 0; i < inorder.length; i++){
            InOrder.put(inorder[i], i);
        }

        return split(preorder, InOrder, 0, 0, inorder.length - 1);
    }
}

