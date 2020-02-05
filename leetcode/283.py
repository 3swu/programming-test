from typing import List

class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        for i in range(len(nums) - 1):
            have_0 = False
            for j in range(len(nums) - i - 1):
                if nums[j] == 0:
                    have_0 = True
                    nums[j], nums[j + 1] = nums[j + 1], nums[j]
            if not have_0:
                break

            

if __name__ == '__main__':
    a = [1,1,1,2,3]
    Solution().moveZeroes(a)
    print(a)