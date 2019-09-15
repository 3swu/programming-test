# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def rotateRight(self, head: ListNode, k: int) -> ListNode:
        if head == None:
            return head
        
        rear = head
        list_len = 1
        while rear.next != None:
            rear = rear.next
            list_len += 1

        rear.next = head

        for _ in range((list_len - k) % list_len):
            head, rear = head.next, rear.next

        rear.next = None
        return head

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
    print_list(Solution().rotateRight(generate_list([0, 1, 2]), 4))