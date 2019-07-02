import sys

# for line in sys.stdin:
#     line = line.strip()

#     l = line.split(',')
#     l = list(map(int, l))
# l = [100, 4, 200, 1, 3, 2]
# length = len(l)
# dp_inc, dp_dec = [1] * length, [1] * length
# for i in range(length):
#     if i == 0:
#         dp_inc[i] = dp_dec[i] = 1
#     else:
#         if l[i] - 1 in l:
#             dp_inc[i] = dp_inc[l.index(l[i] - 1)] + 1
#             # dp_inc.append(dp_inc[l.index(l[i] - 1)] + 1)
#         else:
#             dp_inc[i] = 1
#             # dp_inc.append(1)
#         if l[i] + 1 in l:
#             dp_dec[i] = dp_dec[l.index(l[i] + 1)] + 1
#             # dp_dec.append(dp_dec[l.index(l[i] + 1)] + 1)
#         else:
#             dp_dec[i] = 1
#             # dp_dec.append(1)

# print(max([max(dp_inc), max(dp_dec)]))
# import sys

for line in sys.stdin:
    line = line.strip()

    l = (list(map(int, line.split(','))))

    l.sort()
    maxl = 1
    length = 1
    for i in range(1, len(l)):
        if l[i] == l[i - 1] + 1:
            length += 1
        else:
            maxl = length if length > maxl else maxl
            length = 1
    print(maxl)
