import sys
input = sys.stdin.readline

n, m = map(int, input().split())    #회원 수 N, 친분 관계 M

w = list(map(int, input().split()))
d = {}

num = 0

for i in range(1, n+1):
    d[i] = []

for i in range(m):
    a, b = map(int, input().split())
    d[a].append(w[b-1])
    d[b].append(w[a-1])

for key, value in d.items():
    if not value:
        num += 1
    else:
        sortm = sorted(value, reverse=True)
        if w[key-1] > sortm[0]:
            num += 1

print(num)

