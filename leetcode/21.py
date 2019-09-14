# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        if l1 == None:
            return l2
        if l2 == None:
            return l1
        
        p = ListNode(0)
        cur = p

        while(l1 != None and l2 != None):
            if l1.val < l2.val:
                cur.next, cur = l1, l1
                l1 = l1.next
            else:
                cur.next, cur = l2, l2
                l2 = l2.next
        
        if l1 != None:
            cur.next = l1
        if l2 != None:
            cur.next = l2
        
        return p.next


def generate_list(l):
    p = ListNode(0)
    cur = p
    for val in l:
        cur.next = ListNode(val)
        cur = cur.next
    return p.next

def print_list(list_):
    # for node in list_:
    #     print(node.val + ' ')
    # print('\n')
    while list_ != None:
        print(str(list_.val))
        list_ = list_.next
        
if __name__ == '__main__':
    list1 = generate_list([1, 2, 4])
    list2 = generate_list([1, 3, 4])
    print_list(Solution().mergeTwoLists(list1, list2))