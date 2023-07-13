t = int(input())
 
for i in range(t):
    n = int(input())
    np = n+1
    q = 0
    for x in range(np):
        for y in range(np):
            if x*x + y*y <= n*n:
                q += 1
    result = q*4 - (np)*4 + 1
    print('#', i+1, ' ', result, sep='')
