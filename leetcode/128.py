from typing import List

class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        s = set(nums)
        max_len = 0
        for n in s:
            if n - 1 not in s:
                i = 1
                while n + i in s:
                    i += 1
                max_len = max([max_len, i])
        return max_len

if __name__ == '__main__':
    print(Solution().longestConsecutive([100, 4, 200, 1 ,6]))
