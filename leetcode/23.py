# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def mergeKLists(self, lists):
        def get_list_min_val():
            min_node = 0
            for i, node in enumerate(lists):
                min_node = i if node.val < lists[min_node].val else min_node

            return min_node

        lists = list(filter(lambda x : x != None, lists))
                

        if len(lists) == 0:
            return None

        p = ListNode(0)
        cur = p
        
        while(len(lists) > 1):
            m_node = get_list_min_val()
            cur.next = lists[m_node]
            cur = cur.next
            lists[m_node] = lists[m_node].next
            if lists[m_node] == None:
                lists.pop(m_node)

        cur.next = lists[0]

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
    lists = []
    lists.append(generate_list([1, 4, 5]))
    lists.append(generate_list([1, 3, 4]))
    lists.append(generate_list([2, 6]))
    print_list(Solution().mergeKLists(lists))
