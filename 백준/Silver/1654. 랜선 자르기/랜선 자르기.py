K, N = map(int, input().split())

arr = []

for i in range(K):
    arr.append(int(input()))

left = 0
right = max(arr)

while left < right:
    mid = (left + right) // 2
    if mid == left:
        break
    total = 0
    for x in arr:
        total += x // mid
    if total >= N:
        left = mid
    else:
        right = mid

total = 0
for x in arr:
    total += x // (left+1)
if total >= N:
    left += 1

print(left)