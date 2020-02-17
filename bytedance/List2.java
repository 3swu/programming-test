package List2;

import java.util.ArrayDeque;
import java.util.Deque;

public class List2 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode ans = new Solution().reverseList(head);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        Deque<ListNode> stack = new ArrayDeque<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        ListNode ans = new ListNode(-1), ans_tail = ans;
        while (!stack.isEmpty()) {
            ans_tail.next = stack.pop();
            ans_tail = ans_tail.next;
            ans_tail.next = null;
        }
        return ans.next;
    }
}