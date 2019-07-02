class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def reverseList(self, head, tail = None):
        # if head.next == None:
        #     return head
        # else:
        #     self.reverseList(head.next).next = head
        #     return head
        if head == None:
            return tail
        else:
            p = head.next
            head.next = tail
            return self.reverseList(p, head)

if __name__ == '__main__':
    p = ListNode(1)
    p.next = ListNode(2)
    p.next.next = ListNode(3)
    p1 = Solution().reverseList(p)
    while p1 != None:
        print(p1.val)
        p1 = p.next