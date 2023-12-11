N, M = map(int, input().split())

trees = list(map(int, input().split()))

left = 0
right = max(trees)
mid = (left+right)//2

result = 0

while left <= right:
    sum = 0
    for tree in trees:
        if tree > mid:
            sum += tree - mid
    if sum == M:
        result = mid
        break
    elif sum > M:
        result = mid
        left = mid+1
        mid = (left+right)//2
    else:
        right = mid-1
        mid = (left+right)//2

print(result)