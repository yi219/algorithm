import sys

N, M = map(int, input().split())

dic = dict()

for i in range(N):
    site, pw = map(str, sys.stdin.readline().split())
    dic[site] = pw

for i in range(M):
    search = sys.stdin.readline().strip()
    print(dic[search])
