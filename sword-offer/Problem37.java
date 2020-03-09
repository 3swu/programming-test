package Problem37;


public class Problem37 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(-1);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(-3);
        System.out.println(new Codec().serialize(root));
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Codec {
    private int p = 0;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "$";
        return String.valueOf(root.val) + ',' + serialize(root.left) + ',' + serialize(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        p = 0;
        if (data == null || data.length() == 0)
            return null;
        String[] dataList = data.split(",");
        return deserializeWork(dataList);
    }

    private TreeNode deserializeWork(String[] data) {
        if (p < data.length && !data[p++].equals("$")) {
            TreeNode node = new TreeNode(Integer.parseInt(data[p - 1]));
            node.left = deserializeWork(data);
            node.right = deserializeWork(data);
            return node;
        }
        return null;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));