T = int(input())

for i in range(T):
    d = {}
    N = int(input())
    for n in range(N):
        a, tag = map(str, input().split())
        if tag not in d:
            d[tag] = 1
        else:
            d[tag] += 1
    result = 1
    for t in d.values():
        result *= (t+1)
    print(result-1)