class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        d = {}
        if len(s) != len(t):
            return False
        elif len(s) == 0 and len(t) == 0:
            return True
        for i in range(len(s)):
            d[s[i]] = d.get(s[i], 0) + 1
            d[t[i]] = d.get(t[i], 0) - 1
        result = set(d.values())
        return True if len(result) == 1 and 0 in result else False

if __name__ == '__main__':
    print(Solution().isAnagram('wulei', 'iluwl'))