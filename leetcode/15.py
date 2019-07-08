class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        nums.sort()
        length = len(nums)
        for i in range(length - 2):
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            if nums[i] > 0:
                break
            left = i + 1
            right = length - 1
            while left < right:
                s = nums[i] + nums[left] + nums[right]
                if s == 0:
                    result.append([nums[i], nums[left], nums[right]])
                    left += 1
                    right -= 1
                    while left < right and nums[left] == nums[left - 1]:
                        left += 1
                    while right > left and right < length - 1 and nums[right + 1] == nums[right]:
                        right -= 1
                elif s < 0:
                    left += 1
                else:
                    right -= 1
                    
            
        return result


if __name__ == '__main__':
    print(Solution().threeSum([3,-2,1,0]))