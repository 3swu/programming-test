from typing import List
from queue import PriorityQueue

class Solution:
    def kthSmallest(self, matrix: List[List[int]], k: int) -> int:
        length = len(matrix) * (len(matrix[0]) if len(matrix) > 0 else 0)
        pq = PriorityQueue()
        for row in matrix:
            for n in row:
                pq.put(n)
                if pq.qsize() > length - k + 1:
                    pq.get()
        return pq.get()

if __name__ == "__main__":
    print(Solution().kthSmallest([[1,5,9],[10,11,13],[12,13,15]], 8))