package List1;

public class List1 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);

        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode ans = new Solution().mergeTwoLists(l1, l2);
        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(-1);
        ListNode ans_tail = ans;
        ListNode p1 = l1, p2 = l2;
        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                ans_tail.next = p1;
                ans_tail = ans_tail.next;
                p1 = p1.next;
            }
            else {
                ans_tail.next = p2;
                ans_tail = ans_tail.next;
                p2 = p2.next;
            }
        }
        if (p1 != null)
            ans_tail.next = p1;
        if (p2 != null)
            ans_tail.next = p2;
        return ans.next;
    }
}