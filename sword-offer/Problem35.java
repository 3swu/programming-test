package Problem35;

public class Problem35 {
}

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class Solution {
    public Node copyRandomList(Node head) {
        Node p = head ,temp = null;
        while (p != null) {
            temp = new Node(p.val);
            temp.next = p.next;
            p.next = temp;
            p = temp.next;
        }
        p = head;
        while (p != null) {
            if (p.random != null) p.next.random = p.random.next;
            p = p.next.next;
        }
        Node result = new Node(-1), tail = result;
        Node headTail = new Node(-1);
        headTail.next = head;
        p = head;
        for (int i = 0; p != null; p = p.next, i++) {
            if ((i & 1) == 1) {
                tail.next = p;
                tail = p;
            }
            else {
                headTail.next = p;
                headTail = p;
            }
        }
        headTail.next = null;
        return result.next;

    }
}