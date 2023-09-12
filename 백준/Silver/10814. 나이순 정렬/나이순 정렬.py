import sys

n = int(sys.stdin.readline())

arr = []

for i in range(n):
    arr.append(list(sys.stdin.readline().strip().split()))
arr.sort(key=lambda x: int(x[0]))

for age, name in arr:
    print(age, name)