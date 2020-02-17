package List3;

public class List3 {
    public static void main(String[] args) {
        // TODO call Solution
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int flag = 0;
        ListNode ans = new ListNode(-1), ans_tail = ans;
        while (l1 != null && l2 != null) {
            int temp = l1.val + l2.val + flag;
            if (temp > 9) {
                temp %= 10;
                flag = 1;
            }
            else
                flag = 0;
            ans_tail.next = new ListNode(temp);
            ans_tail = ans_tail.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int temp = l1.val + flag;
            if (temp > 9) {
                temp %= 10;
                flag = 1;
            }
            else
                flag = 0;
            ans_tail.next = new ListNode(temp);
            ans_tail = ans_tail.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            int temp = l2.val + flag;
            if (temp > 9) {
                temp %= 10;
                flag = 1;
            }
            else
                flag = 0;
            ans_tail.next = new ListNode(temp);
            ans_tail = ans_tail.next;
            l2 = l2.next;
        }
        if (flag == 1)
            ans_tail.next = new ListNode(1);
        return ans.next;
    }
}