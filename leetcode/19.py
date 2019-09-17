# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        if head == None:
            return None
        p_mid, p_rear = head, head
        for _ in range(n):
            p_rear = p_rear.next

        if p_rear == None:
            head = head.next
            return head

        p_t = p_mid
        p_mid, p_rear = p_mid.next, p_rear.next

        while p_rear != None:
            p_t, p_mid, p_rear = p_t.next, p_mid.next, p_rear.next

        p_t.next = p_mid.next

        return head
        

def generate_list(l):
    p = ListNode(0)
    cur = p
    for val in l:
        cur.next = ListNode(val)
        cur = cur.next
    return p.next

def print_list(list_):
    while list_ != None:
        print(str(list_.val))
        list_ = list_.next

if __name__ == '__main__':
    print_list(Solution().removeNthFromEnd(generate_list([1, 2, 3, 4, 5]), 5))