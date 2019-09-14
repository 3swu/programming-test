class Solution:
    def generateParentesis(self, n):
        ans = []

        def backtrace(s = '', left = 0, right = 0):
            if len(s) == 2 * n:
                ans.append(s)
            if left < n:
                backtrace(s + '(', left + 1, right)
            if left > right:
                backtrace(s + ')', left, right + 1)
        
        backtrace()
        return ans
    
if __name__ == '__main__':
    print(Solution().generateParentesis(3))