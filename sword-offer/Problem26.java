package Problem26;

public class Problem26 {
    //TODO main
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
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A != null && B != null) {
            return work(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
        }
        return false;
    }

    private boolean work(TreeNode A, TreeNode B) {
        if (B == null) return true;
        if (A == null) return false;
        return A.val == B.val && work(A.left, B.left) && work(A.right, B.right);
    }
}