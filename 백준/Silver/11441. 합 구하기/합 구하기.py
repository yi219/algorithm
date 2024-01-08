import sys
N = int(sys.stdin.readline().rstrip())
nums = list(map(int, sys.stdin.readline().split()))
M = int(sys.stdin.readline().rstrip())

sum = 0
for i in range(N):
    sum += nums[i]
    nums[i] = sum

for i in range(M):
    start, end = map(int, sys.stdin.readline().split())
    end -= 1
    start -= 2
    if start < 0:
        start = 0
        sys.stdout.write(str(nums[end]) + "\n")
    else:
        sys.stdout.write(str(nums[end] - nums[start]) + "\n")