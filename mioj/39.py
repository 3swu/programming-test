import sys

m, n = 0, 0
matrix = []
for line in sys.stdin:
    line = line.strip()
    matrix.append(list(map(int, line.split(' '))))
    m += 1

n = len(matrix[0])
max_sum = 0
for i in range(m - 1):
    for j in range(n - 1):
        max_sum = (matrix[i][j] + matrix[i + 1][j + 1]) if (matrix[i][j] + matrix[i + 1][j + 1]) > max_sum else max_sum

print(max_sum)