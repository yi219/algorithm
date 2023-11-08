n, m = map(int, input().split())

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
        if arr:
            a = arr[len(arr)-1]
            if i+1 >= a:
                arr.append(i + 1)
                search(depth+1, n, m)
                arr.pop()
        else:
            arr.append(i + 1)
            search(depth+1, n, m)
            arr.pop()

search(0, n, m)