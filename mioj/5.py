# import sys

# for line in sys.stdin:
#     line = line.strip()

line = '4,5,6,7,0,1,2'
# line = list(map(int, line.split(',')))
# line.sort()
# print(line[int(len(line) / 2)])
print(sorted(list(map(int, line.split(','))))[int(len(line) / 2)])