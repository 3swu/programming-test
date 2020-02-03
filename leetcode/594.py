from typing import List

class Solution:
    def findLHS(self, nums: List[int]) -> int:
        d = {}
        for n in nums:
            d[n] = d.get(n, 0) + 1
        max_len = 0
        for k in d.keys():
            if k + 1 in d.keys():
                max_len = max([max_len, d[k] + d[k + 1]])
        return max_len

if __name__ == '__main__':
    print(Solution().findLHS([1,3,2,2,5,2,3,7]))

