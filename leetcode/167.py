from typing import List
class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        front, rear = 0, len(numbers) - 1
        while front < rear:
            if numbers[front] + numbers[rear] == target:
                return [front + 1, rear + 1]
            elif numbers[front] + numbers[rear] < target:
                front += 1
            else:
                rear -= 1

if __name__ == '__main__':
    numbers = [2, 7, 11, 15]
    target = 9
    print(Solution().twoSum(numbers, target))