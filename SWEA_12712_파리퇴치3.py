t = int(input())

for tt in range(t):
	n, m = map(int, input().split())
	arr = list(list(map(int, input().split())) for _ in range(n))
	#상하좌우 이동
	dt = [(0,1), (0,-1), (-1,0), (1,0)]
	#대각선 이동
	dc = [(1,1), (1,-1), (-1,1), (-1,-1)]
	result = 0
	for i in range(n):
		for j in range(n):
			sump = arr[i][j]	#+ 총합
			sumx = arr[i][j]	#x 총합
			for k in range(1,m):
				for d in dt:
					x = i + d[0]*k
					y = j + d[1]*k
					if 0 <= x < n and 0 <= y < n:
						sump += arr[x][y]
				for d in dc:
					x = i + d[0]*k
					y = j + d[1]*k
					if 0 <= x < n and 0 <= y < n:
						sumx += arr[x][y]
			if sump > sumx and sump > result:
				result = sump
			elif sump < sumx and sumx > result:
				result = sumx
	print('#', tt+1, ' ', result, sep='')
