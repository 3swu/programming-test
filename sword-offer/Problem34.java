package Problem34;

import java.util.ArrayList;
import java.util.List;

public class Problem34 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        List<List<Integer>> result = new Solution().pathSum(root, 3);
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

class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) return result;
        path.add(root.val);
        boolean isLeaf = root.left == null && root.right == null;
        if (isLeaf && root.val == sum) {
            result.add(path);
            path = new ArrayList<>(path);
        }
        if (root.left != null) pathSum(root.left, sum - root.val);
        if (root.right != null) pathSum(root.right, sum - root.val);
        path.remove(path.size() - 1);
        return result;
    }
}