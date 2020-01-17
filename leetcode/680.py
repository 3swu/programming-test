class Solution:
    def validPalindrome(self, s: str) -> bool:
        front, rear = 0, len(s) - 1
        while front <= rear:
            if s[front] == s[rear]:
                front += 1
                rear -= 1
            else:
                return self.isPalindrome(s, front + 1, rear) or self.isPalindrome(s, front, rear - 1)
        return True

    def isPalindrome(self, s: str, front: int, rear: int) -> bool:
        s = s[front:rear+1]
        return s == s[::-1]

if __name__ == '__main__':
    print(Solution().validPalindrome('aba'))