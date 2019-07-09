class Solution:
    def reverse(self, x: int) -> int:
        s = str(x)
        temp = ''
        if s[0] == '-':
            temp = '-'
            for i in range(1, len(s)):
                temp += s[-i]
        else:
            for i in range(1, len(s) + 1):
                temp += s[-i]
                
        temp = int(temp)
        if temp < -2147483648 or temp > 2147483647:
            temp = 0
        return temp