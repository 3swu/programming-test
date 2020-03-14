package Problem68_I;

public class Problem68_I {
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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || (p.val - root.val) * (q.val - root.val) <= 0) return root;
        return lowestCommonAncestor(root.val > p.val ? root.left : root.right, p, q);
    }
}