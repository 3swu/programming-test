from typing import List

class Solution:
    def matrixReshape(self, nums: List[List[int]], r: int, c: int) -> List[List[int]]:
        if len(nums) * len(nums[0]) != r * c:
            return nums
        result = []
        c_count = 0
        for row in nums:
            for n in row:
                if c_count == 0:
                    result.append([])
                result[-1].append(n)
                c_count = c_count + 1 if c_count + 1 < c else 0
        return result

if __name__ == '__main__':
    print(Solution().matrixReshape([[1,2,2], [3,3,4]], 3, 2))

                
                
