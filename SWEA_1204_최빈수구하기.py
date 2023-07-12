#[S/W 문제해결 기본] 1일차 - 최빈수 구하기


t = int(input())
for i in range(t):
	n = int(input())
	l = list(map(int, input().split()))
	numdict = {}
	for num in l:
		if num in numdict:
			numdict[num] += 1
		else:
			numdict[num] = 1
	s = sorted(numdict.items(), key=lambda x: (-x[1], -x[0]))
	print('#', n, ' ', s[0][0], sep = '')

