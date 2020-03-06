package Problem18;

public class Problem18 {
    public static void main(String[] args) {
        System.out.println(new Solution().deleteNode(null, 0));
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
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null)
            return null;
        if (head.val == val) {
            if (head.next == null)
                return null;
            else {
                head = head.next;
                head.next = deleteNode(head.next, val);
                return head;
            }
        }
        head.next = deleteNode(head.next, val);
        return head;

    }
}