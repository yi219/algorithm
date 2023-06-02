# ** 또는 pow => O(N)
# 고속 거듭제곱 알고리즘 => O(logN)
# 주석은 시간제한 초과

import sys
input = sys.stdin.readline

k, p, n = map(int, input().split())

result = k
#0.1초당 증가량은 p
#최종 수퍼바이러스 개수는 k*p^(10N)

exp = 10*n
result = k
while exp > 0:
    if exp % 2 != 0:    #홀수일 때
        result = (result * p) % 1000000007
    exp //= 2
    p = (p * p) % 1000000007

print(result)


'''
exp = 10*n

result = k
while(exp):
    if exp % 2:
        result *= p
    p *= p
    exp //= 2

print(result % 1000000007)
'''
    
