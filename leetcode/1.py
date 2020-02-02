from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for idx, n in enumerate(nums):
            if target - n in nums:
                loc = nums.index(target - n)
                if loc == idx:
                    continue
                else:
                    return [idx, loc]

if __name__ == '__main__':
    print(Solution().twoSum([3, 2, 4], 6))
            