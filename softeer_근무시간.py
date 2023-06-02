import sys
input = sys.stdin.readline

time = 0

for i in range(5):
    a, b = map(str, input().split())
    a = list(map(int, a.split(':')))
    b = list(map(int, b.split(':')))

    time += 60-a[1] + 60*(b[0]-a[0]-1) + b[1]

print(time)
