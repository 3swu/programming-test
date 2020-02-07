from typing import List

class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        l = sorted(nums)
        for i in range(1, len(l)):
            if l[i - 1] == l[i]:
                return l[i]
        return -1
