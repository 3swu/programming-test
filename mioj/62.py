line = '({[])}'
stack = []
d = {')': '(', ']': '[', '}': '{'}
for i in range(len(line)):
    if line[i] in ['(', '[', '{']:
        stack.append(line[i])
    else:
        if stack[-1] == d[line[i]]:
            stack.pop()
        else:
            print('0')
            exit()
if len(stack) == 0:
    print('1')
else:
    print('0')