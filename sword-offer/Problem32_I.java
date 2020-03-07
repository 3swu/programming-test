package Problem32_I;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem32_I {
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
    public int[] levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return new int[]{};
        queue.add(root);
        while (!queue.isEmpty()) {
            if (queue.peek().left != null)
                queue.add(queue.peek().left);
            if (queue.peek().right != null)
                queue.add(queue.peek().right);
            result.add(queue.poll().val);
        }
        int[] list = new int[result.size()];
        for (int i = 0; i < result.size(); i++)
            list[i] = result.get(i);
        return list;

    }
}