import sys

for line in sys.stdin:
    line = line.strip()

    a_list, b_list = [], []
    line = line.split('-')
    for i in range(len(line[0])):
        a_list.append(int(line[0][i]))

    for i in range(len(line[1])):
        b_list.append(int(line[1][i]))

    result_list = []
    i = 0
    flag = 0
    for i in range(len(b_list)):
        if a_list[-i-1] >= b_list[-i-1] + flag:
            a_list[-i-1] -= b_list[-i-1] + flag
            flag = 0
        else:
            a_list[-i-1] = a_list[-i-1] + 10 - b_list[-i-1] - flag
            flag = 1
    if flag == 1:
        a_list[-i-2] -= 1
    a_list = list(map(str, a_list))
    print(int(''.join(a_list)))