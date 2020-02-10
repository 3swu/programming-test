class Solution:
    def minSteps(self, s: str, t: str) -> int:
        sd, td = {}, {}
        for i in range(len(s)):
            sd[s[i]] = sd.get(s[i], 0) + 1
            td[t[i]] = td.get(t[i], 0) + 1
        count = self.helper(sd, td)
        return count
    
    def helper(self, sd: dict, td: dict):
        count = 0
        for c in sd.keys():
            while sd[c] > 0:
                if c in td.keys() and td[c] > 0:
                    sd[c] -= 1
                    td[c] -= 1
                else:
                    sd[c] -= 1
                    count += 1
        return count

if __name__ == "__main__":
    print(Solution().minSteps('anagram', 'mangaar'))