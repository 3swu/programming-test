package Problem06;

import java.util.Stack;

public class Problem06 {
    //TODO main
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
    public int[] reversePrint(ListNode head) {
        int count = 0;
        Stack<ListNode> stack = new Stack<ListNode>();
        while (head != null) {
            stack.push(head);
            count++;
            head = head.next;
        }
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = stack.pop().val;
        }
        return result;

    }
}