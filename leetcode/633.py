import math

class Solution:
    def judgeSquareSum(self, c: int) -> bool:
        l = list(map(lambda x: x ** 2, list(range(math.ceil(math.sqrt(c)) + 1))))
        front, rear = 0, len(l) - 1
        while front <= rear:
            sum = l[front] + l[rear]
            if sum == c:
                return True
            elif sum < c:
                front += 1
            else:
                rear -= 1
        return False

if __name__ == '__main__':
    print(Solution().judgeSquareSum(2))