import sys

while True:
    n = sys.stdin.readline().strip()
    if n == "0":
        break
    s = True
    for i in range(len(n)//2):
        if n[i] != n[len(n)-1-i]:
            s = False
            print("no")
            break
    if s:
        print("yes")