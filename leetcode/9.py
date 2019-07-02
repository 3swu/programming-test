def isPalindrome(x):
    l = []
    if x == 0:
        return True
    if x < 0:
        return False
    while x != 0:
        a = x % 10
        l.append(a)
        x = x // 10
    left, right = 0, len(l) - 1
    while left <= right:
        if l[left] == l[right]:
            left += 1
            right -= 1
        else:
            return False
    return True

if __name__ == '__main__':
    print(isPalindrome(-123321))