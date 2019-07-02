def evalRPN(tokens):
    cal, stack = {
        '+': lambda y, x: x + y,
        '-': lambda y, x: x - y,
        '*': lambda y, x: x * y,
        '/': lambda y, x: int(x / y)
    }, []
    for token in tokens:
        stack.append(cal[token](stack.pop(), stack.pop()) if token in cal.keys() else int(token))
    return stack[0]


if __name__ == '__main__':
    print(evalRPN(["10","6","9","3","+","-11","*","/","*","17","+","5","+"]))
        