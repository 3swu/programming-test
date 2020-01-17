class Solution:
    def reverseVowels(self, s: str) -> str:
        s = list(s)
        front, rear = 0, len(s) - 1
        temp = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']
        while front < rear:
            while s[front] not in temp and front < rear:
                front += 1
            while s[rear] not in temp and front < rear:
                rear -= 1
            if front < rear:
                s[front], s[rear] = s[rear], s[front]
                front += 1
                rear -= 1
        return ''.join(s)

if __name__ == '__main__':
    print(Solution().reverseVowels('leetcode'))