import sys

n = int(sys.stdin.readline())

arr = []

for i in range(n):
    a = sys.stdin.readline().strip()
    if a not in arr:
        arr.append(a)

arr.sort(key=lambda x: (len(x), x))

for i in arr:
    print(i)