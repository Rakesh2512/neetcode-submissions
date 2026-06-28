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

    // Encodes a tree to a single string.
    public void PreorderSerialize(TreeNode root,StringBuilder sb){
        if(root == null){
            sb.append("null,");
        }
        else{
            sb.append(root.val).append(",");
            PreorderSerialize(root.left,sb);
            PreorderSerialize(root.right,sb);
        }
    }
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        PreorderSerialize(root,sb);
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
            TreeNode root = new TreeNode(num);
            list.remove(0);
            root.left = solve(list);
            root.right = solve(list);
            return root;
        }
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] s = data.split(",");
        List<String>list = new ArrayList<>(Arrays.asList(s));

        //String val = list.get(0);
        return solve(list);
    }
}
