def findNum(nums, i, n):
    if n == 0:
        return True
    elif n < 0:
        return False
    else:
        result = False
        for j in range(i, len(nums) - 1):
            result = result or findNum(nums, j + 1, n - nums[j])
        return result

line = '1,2,6,4'
line = list(map(int, line.split(',')))
s = sum(line)
if s % 2 == 1:
    print('false')
else:
    target = int(s / 2)
    print('true' if findNum(line, 0, target) else 'false')

    