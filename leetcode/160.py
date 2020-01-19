# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> ListNode:
        if headA == None or headB == None:
            return None
        p1, p2 = headA, headB
        conut = 0
        flag1, flag2 = False, False
        while True:
            if p1.next == None:
                if flag1:
                    return None
                p1 = headB
                flag1 = True
            else:
                p1 = p1.next
            if p2.next == None:
                if flag2:
                    return None
                p2 = headA
                flag2 = True
            else:
                p2 = p2.next
            if flag1 and flag2 and p1 == p2:
                return p1

