from typing import List

class Solution:
    def dailyTemperatures(self, T: List[int]) -> List[int]:
        result = [0 for _ in range(len(T))]
        stack = []
        for i in range(len(T)):
            if len(stack) == 0 or T[stack[-1]] >= T[i]:
                stack.append(i)
            elif T[stack[-1]] < T[i]:
                while len(stack) != 0 and T[stack[-1]] < T[i]:
                    result[stack[-1]] = i - stack[-1]
                    stack.pop()
                stack.append(i)
        result[-1] = 0

        return result

if __name__ == '__main__':
    print(Solution().dailyTemperatures([73,74,75,71,69,72,76,73]))