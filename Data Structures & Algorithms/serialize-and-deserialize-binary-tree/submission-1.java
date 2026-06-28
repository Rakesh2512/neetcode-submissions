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


public class Codec {

    public void preorderSerialize(TreeNode root,StringBuilder sb){
        if(root == null){
            sb.append("null,");
        }
        else{
            sb.append(root.val).append(",");
            preorderSerialize(root.left,sb);
            preorderSerialize(root.right,sb);
        }
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        preorderSerialize(root,sb);
        return sb.toString();
    }

    public TreeNode solve(List<String>list){
        String val = list.get(0);
        if(val.equals("null")){
            list.remove(0);
            return null;
        }
        else{
            int num = Integer.parseInt(val);
            list.remove(0);
            TreeNode newNode = new TreeNode(num);
            newNode.left = solve(list);
            newNode.right = solve(list);
            return newNode;
        }
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] s = data.split(",");
        List<String>list = new ArrayList<>(Arrays.asList(s));
        return solve(list);
    }
}
