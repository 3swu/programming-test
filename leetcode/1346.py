from typing import List
class Solution:
    def checkIfExist(self, arr: List[int]) -> bool:
        d = {}
        for n in arr:
            d[n] = d.get(n, 0) + 1
        for n in arr:
            if n == 0:
                if d.get(0, 0) > 1:
                    return True
            elif d.get(2 * n, 0) != 0:
                return True
        return False

if __name__ == '__main__':
    print(Solution().checkIfExist([2,10,-19,4,6,-8]))
        