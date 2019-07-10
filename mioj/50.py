line = '2,3,2'
line = list(map(int, line.split(',')))
max_s = 0
for i in range(len(line)):
    left, right = i - 1, i + 1
    while right < len(line):
        if line[right] >= line[i]:
            right += 1
            continue
        break
    while left >= 0:
        if line[left] >= line[i]:
            left -= 1
            continue
        break
    cur_s = line[i] * (right - left - 1)
    max_s = cur_s if cur_s > max_s else max_s
print(max_s)