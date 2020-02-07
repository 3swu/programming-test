from typing import List

class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        cache = [0 for _ in range(len(nums))]
        for n in nums:
            cache[n - 1] += 1
        return [cache.index(2) + 1, cache.index(0) + 1]

if __name__ == "__main__":
    print(Solution().findErrorNums([1,2,2,4]))