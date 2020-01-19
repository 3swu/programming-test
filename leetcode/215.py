# Kth element
from queue import PriorityQueue
from typing import List

class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        # nums = sorted(nums, reverse=True)
        # return nums[k - 1]
        priority_queue = PriorityQueue()
        for num in nums:
            priority_queue.put(num)
            if priority_queue.qsize() > k:
                priority_queue.get()
        return priority_queue.get()

if __name__ == "__main__":
    print(Solution().findKthLargest([3,2,1,5,6,4], 2))

        
        
