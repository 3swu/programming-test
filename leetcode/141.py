# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def hasCycle(self, head: ListNode) -> bool:
        if head == None:
            return False
        p1, p2 = head, head.next
        while p1 != None and p2 != None and p2.next != None:
            if p1 == p2:
                return True
            p1 = p1.next
            p2 = p2.next.next
        return False

if __name__ == '__main__':
    head = ListNode(3)
    head.next = ListNode(2)
    head.next.next = ListNode(0)
    head.next.next.next = ListNode(-4)
    head.next.next.next.next = head.next
    print(Solution().hasCycle(head))