import copy

n, m = map(int, input().split())
nums = list(map(int, input().split()))

arr = []
visited = [False for i in range(n)]
result = []

def search(depth, n, m):
    if depth == m:
        result.append(copy.deepcopy(arr))
        return
    for i in range(n):
        if not visited[i]:
            arr.append(nums[i])
            visited[i] = True
            search(depth + 1, n, m)
            arr.pop()
            visited[i] = False

search(0, n, m)
tupleresult = [tuple(i) for i in result]
for x in sorted(list(set(tupleresult))):
    print(*x)