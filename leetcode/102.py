import copy
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    def levelOrder(self, root: TreeNode):
        if root == None:
            return []
        queen, result, level = [], [], []
        queen.append(root)
        queen.append('#')
        while True:
            elem = queen.pop(0)
            if elem == '#':
                if len(queen) == 0:
                    result.append(copy.copy(level))
                    break
                queen.append('#')
                result.append(copy.copy(level))
                level.clear()
            else:
                level.append(elem.val)
                if elem.left != None:
                    queen.append(elem.left)
                if elem.right != None:
                    queen.append(elem.right)
        return result

if __name__ == '__main__':
    root = TreeNode(1)
    root.left = TreeNode(2)
    root.right = TreeNode(3)
    print(Solution().levelOrder(root))       

        




