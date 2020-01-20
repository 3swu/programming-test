# Kth element
from queue import PriorityQueue
from typing import List

class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        # nums = sorted(nums, reverse=True)
        # return nums[k - 1]
        
        # priority_queue = PriorityQueue()
        # for num in nums:
        #     priority_queue.put(num)
        #     if priority_queue.qsize() > k:
        #         priority_queue.get()
        # return priority_queue.get()

        """
        quick sort
        """
        k = len(nums) - k
        l, r = 0, len(nums) - 1
        j = 0
        while True:
            j = self.partition(nums, l, r)
            if j == k:
                break
            if j < k:
                l = j + 1
            if j > k:
                r = j - 1
        return nums[j]
            


    def partition(self, nums: List[int], l: int, r: int) -> int:
        temp = nums[l]
        left, right = l, r
        while True:
            while nums[right] >= temp and left < right:
                right -= 1
            if left >= right:
                nums[left] = temp
                break
            else:
                nums[left] = nums[right]
            while nums[left] <= temp and left < right:
                left += 1
            if left >= right:
                nums[left] = temp
                break
            else:
                nums[right] = nums[left]
        return right


if __name__ == "__main__":
    print(Solution().findKthLargest([2,1], 2))


        
        
