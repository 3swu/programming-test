
line = '3 - 5 * 6 / 10 + 1'
line = line.split(' ')
nums_stack, operator_stack = [], []
i = 0
while i < len(line):
    if line[i] in ['+', '-']:
        operator_stack.append(line[i])
        i += 1
    elif line[i] in ['*', '/']:
        a = nums_stack.pop()
        b = line[i + 1]
        if line[i] == '/' and b == '0':
            print('err')
            exit()
        nums_stack.append(int(eval(str(a) + line[i] + b)))
        i += 2
    else:
        nums_stack.append(int(line[i]))
        i += 1
while len(operator_stack) > 0:
    operator = operator_stack.pop(0)
    a, b = nums_stack.pop(0), nums_stack.pop(0)
    nums_stack.insert(0, int(eval(str(a) + operator + str(b))))
print(nums_stack[0])
    