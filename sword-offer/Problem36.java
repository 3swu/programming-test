package Problem36;

public class Problem36 {
}

/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
}

class Solution {
    private Node pre = null;
    public Node treeToDoublyList(Node root) {
        if (root == null) return null;
        work(root);
        Node i = null;
        for (i = root; i.left != null; i = i.left);
        i.left = pre;
        pre.right = i;
        return i;
    }

    private Node work(Node root) {
        if (root == null)
            return null;
        if (root.left != null) {
            work(root.left);
        }
        if (pre != null) {
            pre.right = root;
            root.left = pre;
        }
        pre = root;
        if (root.right != null) {
            work(root.right);
        }
        return root;
    }
}