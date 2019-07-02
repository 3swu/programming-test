# import sys

# for line in sys.stdin:
#     line = line.strip()
from functools import cmp_to_key

def cmp(x, y):
    if x[1] > y[1]:
        return -1
    elif x[1] == y[1]:
        return -1 if x[0] < y[0] else 0
    else:
        return 0

line = '1,2,2,3,3 3'
line = line.split(' ')
l, k = line[0], line[1]
l, k = list(map(int, l.split(','))), int(k)
d = {}
for i in l:
    if i in d.keys():
        d[i] += 1
    else:
        d[i] = 1
l = sorted(d.items(), key = cmp_to_key(cmp))

result = []
for i in range(k):
    result.append(str(l[i][0]))
    if i != k - 1:
        result.append(',')

print(''.join(result))
