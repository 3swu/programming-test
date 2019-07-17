def findNum(list, n):
    s = 0
    if n <= 0:
        return 1
    for item in list:
        if item <= n:
            s += findNum(list, n - item)
    return s

if __name__ == '__main__':
    line = '1,2,3 4'
    line = line.split(' ')
    l = list(map(int, line[0].split(',')))
    n = int(line[1])
    print(findNum(l, n))