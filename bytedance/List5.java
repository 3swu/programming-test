package List5;

import java.util.HashSet;
import java.util.Set;

public class List5 {
    public static void main(String[] args) {
        //TODO call Solution
    }
}

class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        for (; head != null; head = head.next) {
            if (set.contains(head))
                return head;
            set.add(head);
        }
        return null;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
