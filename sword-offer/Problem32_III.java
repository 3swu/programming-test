package Problem32_III;

import java.util.*;

public class Problem32_III {
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> aLevel = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        int level = 0, curLevel = 0, nextLevel = 0;
        TreeNode temp = null;
        if (root == null)
            return result;
        queue.add(root);
        curLevel++;
        while (!queue.isEmpty()) {
            if (curLevel == 0) {
                curLevel = nextLevel;
                nextLevel = 0;
                if ((level & 1) == 1)
                    Collections.reverse(aLevel);
                result.add(aLevel);
                level++;
                aLevel = new ArrayList<>();
            }
            temp = queue.poll();
            curLevel--;
            if (temp.left != null) {
                queue.add(temp.left);
                nextLevel++;
            }
            if (temp.right != null) {
                queue.add(temp.right);
                nextLevel++;
            }
            aLevel.add(temp.val);
        }
        if ((level & 1) == 1)
            Collections.reverse(aLevel);
        result.add(aLevel);
        return result;
    }
}