class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        return self.forward(s, t) and self.forward(t, s)

    def forward(self, s: str, t: str):
        d = {}
        for i in range(len(s)):
            a = d.get(s[i], 0)
            if a == 0:
                d[s[i]] = t[i]
            elif a != t[i]:
                return False
        return True

if __name__ == '__main__':
    print(Solution().isIsomorphic('foo', 'gun'))
