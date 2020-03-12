package Problem55_II;

public class Problem55_II {
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
    TreeNode left, right;
    TreeNode(int x) { val = x;}
}

class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return isBalanced(root.left) && isBalanced(root.right) && Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1;
    }

    private int getHeight(TreeNode root) {
        return root == null ? 0 : 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
}