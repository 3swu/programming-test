package Problem32_II;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem32_II {
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
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();
        TreeNode temp = null;
        List<Integer> aLevel = new ArrayList<>();
        int curLevel = 0, nextLevel = 0;
        if (root == null)
            return result;
        queue.add(root);
        curLevel++;
        while (!queue.isEmpty()) {
            if (curLevel == 0) {
                curLevel = nextLevel;
                nextLevel = 0;
                result.add(aLevel);
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
        result.add(aLevel);
        return result;
    }
}