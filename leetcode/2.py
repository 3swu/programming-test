# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        head = ListNode(0)
        pointer = head
        flag = 0
        while l1 != None and l2 != None:
            result = l1.val + l2.val + flag
            if result >= 10:
                flag = 1
                result = result % 10
            else:
                flag = 0
            l1, l2 = l1.next, l2.next
            node = ListNode(result)
            pointer.next = node
            pointer = node

        while l1 != None:
            result = l1.val + flag
            if result >= 10:
                flag = 1
                result = result % 10
            else:
                flag = 0
            l1 = l1.next
            node = ListNode(result)
            pointer.next = node
            pointer = node
        
        while l2 != None:
            result = l2.val + flag
            if result >= 10:
                flag = 1
                result = result % 10
            else:
                flag = 0
            l2 = l2.next
            node = ListNode(result)
            pointer.next = node
            pointer = node
        
        if flag == 1:
            pointer.next = ListNode(1)
        
        return head.next


if __name__ == '__main__':
    l1 = ListNode(2)
    l1.next = ListNode(4)
    l1.next.next = ListNode(3)
    l2 = ListNode(5)
    l2.next = ListNode(6)
    l2.next.next = ListNode(4)
    result = Solution().addTwoNumbers(l1, l2)
    print(result)
    