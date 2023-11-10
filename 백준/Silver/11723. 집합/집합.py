import sys

M = int(input())
s = set([])
for i in range(M):
    # method, x = map(str, sys.stdin.readline().split())
    arr = sys.stdin.readline().split()
    if len(arr) == 1:
        if arr[0] == "all":
            s = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}
        else:
            s = set([])
    else:
        method = arr[0]
        x = int(arr[1])
        if method == "add":
            s.add(x)
        elif method == "remove":
            if x in s:
                s.remove(x)
        elif method == "check":
            if x in s:
                print(1)
            else:
                print(0)
        elif method == "toggle":
            if x in s:
                s.remove(x)
            else:
                s.add(x)

