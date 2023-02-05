import sys

n, m = map(int, input().split())

nl = set()
ml = set()

for _ in range(n):
    nl.add(sys.stdin.readline().strip())
for _ in range(m):
    ml.add(sys.stdin.readline().strip())

result = list(set.intersection(nl, ml))
result.sort()

print(len(result))
for i in result:
    print(i)