import sys

N = int(input())

arr = []
for i in range(N):
    arr.append(int(sys.stdin.readline()))

arr.sort()

if N == 0:
    print(0)
else:
    n = N*0.15
    if n - n//1 >= 0.5:
        n = int(n//1 + 1)
    else:
        n = int(n//1)
    total = 0
    for i in range(n, N-n):
        total += arr[i]
    result = total/(N-2*n)
    if result - result//1 >= 0.5:
        result = result//1 + 1
    else:
        result = result//1
    print(int(result))