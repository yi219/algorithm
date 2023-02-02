n, m = map(int, input().split())

loc = list(map(int, input().split()))
num = list(range(1, n+1))

min = 0

for k in range(m):
    #뽑을 수의 현재 위치 찾기
    i = num.index(loc[k])
    n = len(num)

    if i<=n//2:
        min += i
    else:
        min += (-1)*(i-n)

    num = num[i+1:] + num[:i]

print(min)