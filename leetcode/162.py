class Solution:
    def findPeakElement(self, nums):
        for i in range(len(nums)):
            if i == 0 and nums[1] < nums[0]:
                return 0
            if i == len(nums) - 1 and nums[i - 1] < nums[i]:
                return i
            if nums[i - 1] < nums[i] and nums[i + 1] < nums[i]:
                return i
