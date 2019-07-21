max_weight, weight, value = input().strip(), input().strip(), input().strip()
max_weight, weight, value = int(max_weight), list(map(int, weight.split(' '))), list(map(int, value.split(' ')))

dp = [0] * (max_weight + 1)

for i in range(len(weight)):
    j = max_weight
    while j >= weight[i]:
        dp[j] = max(dp[j], dp[j - weight[i]] + value[i])
        j -= 1
print(dp[max_weight])
