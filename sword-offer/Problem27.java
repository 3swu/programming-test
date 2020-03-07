package Problem27;

public class Problem27 {
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

class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if (root != null) {
            TreeNode t = root.left;
            root.left = mirrorTree(root.right);
            root.right = mirrorTree(t);
            return root;
        }
        return null;
    }
}