import sys

# def fun(n):
#     if n == 0 or n == 1:
#         return 1
#     else:
#         return fun(n - 1) + fun (n - 2)

# for line in sys.stdin:
#     line = line.strip()
line = '5'
a, b, c = 1, 1, 0
for i in range(2, int(line) + 1):
    c = a + b
    a = b
    b = c
print(c)
