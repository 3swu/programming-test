import copy

line = "fwfddqhmpcmmmiiiijfrmiimmmmmirwbte"
result = copy.copy(line)

while True:
    flag = 0
    line = copy.copy(result)
    result = ''
    i = 0
    while i < len(line):
        if line[i] == 'm' and i + 1 < len(line) and line[i + 1] == 'i':
            i += 2
            flag = 1
        else:
            result += line[i]
            i += 1
    if flag == 0:
        break
print(result)