n, m = map(int, input().split())

global visited
visited = [False] * n
global arr
arr = []


def search(depth, n, m):
    global arr
    if depth == m:
        for i in arr:
            print(i, " ", sep="", end="")
        print("")
        return
    for i in range(n):
        if not visited[i]:
            visited[i] = True
            arr.append(i + 1)
            search(depth+1, n, m)
            visited[i] = False
            arr.pop()


search(0, n, m)
