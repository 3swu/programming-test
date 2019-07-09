class Solution:
    def isValid(self, s: str) -> bool:
        pattern = {')': '(', ']': '[', '}': '{'}
        stack = []
        if len(s) == 0:
            return True
        if len(s) % 2 == 1:
            return False
        for i in range(len(s)):
            if s[i] in pattern.values():
                stack.append(s[i])
            else:
                if len(stack) != 0 and stack[-1] == pattern[s[i]]:
                    stack.pop()
                else:
                    return False
        if len(stack) == 0:
            return True
        else:
            return False
        