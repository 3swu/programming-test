package Problem07;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Problem07 {
    public static void main(String[] args) {
        TreeNode root = new Solution().buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7});
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length != 0) {
            TreeNode node = new TreeNode(preorder[0]);
            int rootIdx = 0;
            for (; rootIdx < inorder.length; rootIdx++)
                if (inorder[rootIdx] == node.val)
                    break;
            node.left = buildTree(Arrays.copyOfRange(preorder, 1, rootIdx + 1), Arrays.copyOfRange(inorder, 0, rootIdx));
            node.right = buildTree(Arrays.copyOfRange(preorder, rootIdx + 1, preorder.length), Arrays.copyOfRange(inorder, rootIdx + 1, inorder.length));
            return node;
        }
        return null;
    }
}