import sys

for line in sys.stdin:
    line = line.strip()

    line = list(map(int, line.split(' ')))

    buf = {}
    for i in line:
        buf[i] = buf[i] + 1 if i in buf.keys() else 1

    for t in buf.items():
        if t[1] == 1:
            print(t[0])
        