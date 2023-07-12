t = int(input())

for i in range(t):
    n, m = map(int, input().split())
    ai = list(map(int, input().split()))
    bj = list(map(int, input().split()))
    la = len(ai)
    lb = len(bj)
    numlist = []
    if la <= lb:
        k = lb - la + 1
        for j in range(k):
            total = sum(list(x*y for x, y in zip(ai, bj[j:j+lb])))
            numlist.append(total)
    else:
        k = la - lb + 1
        for j in range(k):
            total = sum(list(x*y for x, y in zip(ai[j:j+la], bj)))
            numlist.append(total)
    print('#', i+1, ' ', max(numlist), sep = '')
        
