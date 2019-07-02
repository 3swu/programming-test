class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    def isSymmetric(self, root: TreeNode) -> bool:
        left_list, right_list = [], []
        def traverse_left(node):
            if node != None:
                traverse_left(node.left)
                left_list.append(node.val)
                traverse_left(node.right)
            else:
                left_list.append(None)
        
        def traverse_right(node):
            if node != None:
                traverse_right(node.right)
                right_list.append(node.val)
                traverse_right(node.left)
            else:
                right_list.append(None)
                
        traverse_left(root.left)
        traverse_right(root.right)
        print(left_list)
        print(right_list)
        return True if left_list == right_list else False

if __name__ == '__main__':
    root = TreeNode(1)
    root.left = TreeNode(2)
    root.left.left = TreeNode(3)
    root.left.right = TreeNode(4)
    root.right = TreeNode(2)
    root.right.left = TreeNode(4)
    root.right.right = TreeNode(3)
    print(Solution().isSymmetric(root))