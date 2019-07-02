# import sys

# for line in sys.stdin:
#     line = line.strip()
line = ' '
line = list(map(int, line.split(',')))
nums = 0
for i in range(len(line)):
    num = 0
    for j in range(i + 1, len(line)):
        if line[j] < line[i]:
            num += 1
    nums += num
print(nums)