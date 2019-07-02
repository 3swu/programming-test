import sys

for line in sys.stdin:
    line = line.strip()
    line = list(map(int, line.split(',')))

    line.sort()
    for i in range(len(line)):
        if line[i] >= 0 and (i + 1 >= len(line) or line[i + 1] != line[i] + 1):
            print(line[i] + 1)
            exit()
    print('1')