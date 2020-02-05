from typing import List

class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        crt_len, max_len = 0, 0
        for n in nums:
            if n == 1:
                crt_len += 1
            else:
                max_len = crt_len if crt_len > max_len else max_len
                crt_len = 0
        return max([crt_len, max_len])

if __name__ == '__main__':
    print(Solution().findMaxConsecutiveOnes([1,0,1,1,0,1]))