N, K = map(int, input().split())

coins = [0 for i in range(N)]

start = 0

find = False

for i in range(N):
    coins[i] = int(input())
    if not find and coins[i] >= K:
        find = True
        start = i

if not find:
    start = N-1

result = 0

for ii in range(start+1):
    n = K // (coins[start - ii])
    result += n
    K -= n*(coins[start-ii])
    if K == 0:
        break
print(result)