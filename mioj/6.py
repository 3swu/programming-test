# import sys

# for line in sys.stdin:
#     line = line.strip()
line = 'aabcc,dbbca,aadbbcbca'
line = line.split(',')
s1, s2, s3 = [], [], []
for i in range(len(line[0])):
    s1.append(line[0][i])
for i in range(len(line[1])):
    s2.append(line[1][i])
for i in range(len(line[2])):
    s3.append(line[2][i])

if len(s1) + len(s2) != len(s3):
    print('false')
    exit()
p1, p2 = 0, 0
while len(s3) > 0:
    l1, l2, length1, length2 = [], [], 0, 0
    a = 0
    while a + p1 < len(s1) and a < len(s3):
        if s3[a] == s1[a + p1]:
            length1 += 1
            a += 1
        else:
            break
    a = 0
    while a + p2 < len(s2) and a < len(s3):
        if s3[a] == s2[a + p2]:
            length2 += 1
            a += 1
        else:
            break

    if (length1 == length2 == 0):
        print('false')
        exit()
    if length1 >= length2:
        for x in range(length1):
            s3.pop(0)
        p1 += length1
    else:
        for x in range(length2):
            s3.pop(0)
        p2 += length2
if len(s3) == 0:
    print('true')