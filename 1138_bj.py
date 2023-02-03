n = int(input())

mem = list(map(int, input().split()))
mem.reverse()   #가장 키가 큰 사람부터

l = []

for i in mem:
    l.insert(i, n)
    n -= 1

print(*l)