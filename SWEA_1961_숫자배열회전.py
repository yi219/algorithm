t = int(input())
for i in range(t):
    n = int(input())
    mat = list(list(map(int, input().split())) for _ in range(n))
    newmat = list(map(list, zip(*mat)))
    print('#', i+1, sep = '')
    for k in range(n):
        r90 = list(reversed(newmat[k]))
        r180 = list(reversed(mat[n-k-1]))
        r270 = newmat[n-k-1]
        print(''.join(map(str, r90)), ''.join(map(str, r180)), ''.join(map(str, r270)))
