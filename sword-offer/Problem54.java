package Problem54;

public class Problem54 {
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
    int result = 0;
    int k = 0;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return result;

    }

    private void dfs(TreeNode root) {
        if (root.right != null) dfs(root.right);
        if (k == 1) {
            result = root.val;
            k--;
            return;
        }
        k--;
        if (root.left != null) dfs(root.left);
    }
}