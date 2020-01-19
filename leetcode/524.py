from typing import List

class Solution:
    def findLongestWord(self, s: str, d: List[str]) -> str:
        max_length = 0
        result = ''
        for c in d:
            if self.is_str_belong(s, c):
                if len(c) > max_length:
                    max_length = len(c)
                    result = c
                elif len(c) == max_length:
                    result = c if c < result else result
        return result


    def is_str_belong(self, s, s1):
        p1, p2 = 0, 0
        while p2 < len(s1):
            while p1 < len(s) and s[p1] != s1[p2]:
                p1 += 1
            if p1 == len(s):
                return False
            p1 += 1
            p2 += 1
        return True

if __name__ == "__main__":
    print(Solution().is_str_belong('abcdefg', 'bde'))