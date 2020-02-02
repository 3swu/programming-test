from typing import List

class Solution:
    def nextGreaterElements(self, nums: List[int]) -> List[int]:
        T = nums + nums
        result = [-1 for _ in range(len(T))]
        stack = []
        for i in range(len(T)):
            if len(stack) == 0 or T[stack[-1]] >= T[i]:
                stack.append(i)
            elif T[stack[-1]] < T[i]:
                while len(stack) != 0 and T[stack[-1]] < T[i]:
                    result[stack[-1]] = T[i]
                    stack.pop()
                stack.append(i)

        return result[:len(nums)]

if __name__ == '__main__':
    print(Solution().nextGreaterElements([1,2,1]))