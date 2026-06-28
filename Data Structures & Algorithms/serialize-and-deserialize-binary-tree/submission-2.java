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
    
    public void PreOrderSerialize(TreeNode root,StringBuilder sb){
        if(root == null){
            sb.append("null,");
        }
        else{
            sb.append(root.val).append(",");
            PreOrderSerialize(root.left,sb);
            PreOrderSerialize(root.right,sb);
        }
    }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        PreOrderSerialize(root,sb);
        return sb.toString();
    }

    public TreeNode PreOrderDes(List<String>list){
        String val = list.get(0);
        if(val.equals("null")){
            list.remove(0);
            return null;
        }
        else{
            int value = Integer.parseInt(val);
            TreeNode node = new TreeNode(value);
            list.remove(0);
            node.left = PreOrderDes(list);
            node.right = PreOrderDes(list);
            return node;
        }
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] s = data.split(",");
        List<String>list = new ArrayList<>(Arrays.asList(s));
        return PreOrderDes(list);
    }
}
