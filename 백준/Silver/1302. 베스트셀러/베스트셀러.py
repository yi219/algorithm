import sys
N = int(sys.stdin.readline().rstrip())

dic = dict()

for i in range(N):
    book = sys.stdin.readline().rstrip()
    if book in dic:
        dic[book] += 1
    else:
        dic[book] = 1


list = sorted(dic.items(), key=lambda x:(-x[1], x[0]))
result = list[0][0]

print(result)