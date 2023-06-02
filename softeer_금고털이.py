#런타임 에러 / 시간제한 초과 유의

import sys
sys.setrecursionlimit(1000000)
input = sys.stdin.readline

w, n = map(int, input().split())

jewels = list(list(map(int, input().split())) for i in range(n))

sortd = sorted(jewels, reverse=True, key=lambda x:x[1])

price = 0   #총 가격

for jewel in sortd:
    if w == 0:
        break;
    else:
        if w <= jewel[0]:
            price += w*jewel[1]
            w -= w 
        else:
            price += jewel[0]*jewel[1]
            w -= jewel[0]
print(price)


'''
w, n = map(int, input().split())

d = {}

for i in range(n):
    d[i] = list(map(int, input().split()))

sortd = sorted(d.items(), reverse=True, key=lambda x:x[1][1])

weight = w  #채워야 하는 무게
price = 0   #총 가격
i = 0
while weight > 0:
    if weight <= sortd[i][1][0]: #가장 비싼 금속으로만 채워도 되는 경우
        price += sortd[i][1][1]*weight
        weight -= weight
    else:   #다음 금속으로 채워야 하는 경우
        price += sortd[i][1][1]*sortd[i][1][0]
        weight -= sortd[i][1][0]
    i += 1
    if i == n:
        break
print(price)
'''
