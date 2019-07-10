line = '123456789 8'
line = line.split(' ')
num, k = line[0], int(line[1])
d = 0
buf = []
for i in range(len(num)):
    buf.append(num[i])

for i in range(1, len(buf)):
    if d < k:
        for j in range(i):
            if buf[j] != '#' and buf[j] > buf[i]:
                if d < k:
                    buf[j] = '#'
                    d += 1
                else:
                    break

result = ''
for i in buf:
    if i != '#':
        result += i

if d < k:
    result = result[0: len(num) - k]
print(int(result))