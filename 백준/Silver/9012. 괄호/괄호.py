import sys

n = int(sys.stdin.readline())

for i in range(n):
    arr = sys.stdin.readline().strip()
    while arr.find("()") != -1:
        arr = arr.replace("()", "")
    if len(arr) == 0:
        print("YES")
    else:
        print("NO")