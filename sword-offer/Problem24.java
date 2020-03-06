package Problem24;


public class Problem24 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode result = new Solution().reverseList(head);
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return null;
        return work(head, null);
    }

    private ListNode work(ListNode head, ListNode tail) {
        if (head.next == null) {
            head.next = tail;
            return head;
        }
        ListNode p = work(head.next, head);
        head = tail;
        return p;
    }
}