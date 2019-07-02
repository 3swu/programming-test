
line = 'a b'
line = line.split(' ')
s1, s2 = [], []
for i in range(len(line[0])):
    s1.append(line[0][i])
for i in range(len(line[1])):
    s2.append(line[1][i])

for i in range(len(s1)):
    if s1[i] in s2:
        s2.remove(s1[i])
    else:
        print('false')
        exit()
print('true')