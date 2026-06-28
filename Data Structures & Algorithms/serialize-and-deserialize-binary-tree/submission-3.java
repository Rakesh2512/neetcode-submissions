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


    public void preOrder(TreeNode root,StringBuilder sb){

        if(root == null){
            sb.append("null,");
        }
        else{
            sb.append(root.val).append(",");
            preOrder(root.left,sb);
            preOrder(root.right,sb);
        }
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        preOrder(root,sb);
        return sb.toString();
    }

    public TreeNode preOrder(List<String>list){

        String value = list.get(0);
        
        if(value.equals("null")){
            list.remove(0);
            return null;
        }
        else{

            int data = Integer.parseInt(value);
            TreeNode node = new TreeNode(data);
            list.remove(0);
            node.left = preOrder(list);
            node.right = preOrder(list);
            return node;
        }
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] s = data.split(",");
        List<String>list = new ArrayList<>(Arrays.asList(s));
        return preOrder(list);
    }
}
