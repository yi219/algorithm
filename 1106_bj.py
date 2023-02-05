import sys
sys.setrecursionlimit(10**6)

#목표 고객 수 C, 도시 개수 N
c, n = map(int, input().split())

info = list(list(map(int, input().split())) for _ in range(n))

l = [0 for i in range(c+1)]

def cost(ctm):
    if(ctm <= 0):
        return 0
    elif(l[ctm] > 0):
        return l[ctm]
    else:
        min = cost(ctm-info[0][1])+info[0][0]
        for i in range(1, n):
            cc = cost(ctm-info[i][1])+info[i][0]
            if (min > cc):
                min = cc
        l[ctm] = min
        return min

print(cost(c))