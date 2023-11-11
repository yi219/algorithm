import sys
from collections import deque


class Node:
    def __init__(self, x, y):
        self.x = x
        self.y = y


N, M = map(int, input().split())
arr = [[]] * N

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]
sx = 0
sy = 0

for i in range(N):
    arr[i] = list(sys.stdin.readline().strip())
    for j in range(M):
        if arr[i][j] == 'I':
            sx = i
            sy = j

queue = deque()

queue.append(Node(sx, sy))
arr[sx][sy] = 'X'

result = 0

while queue:
    node = queue.popleft()
    for i in range(4):
        nx = node.x + dx[i]
        ny = node.y + dy[i]
        if 0 <= nx <= N - 1 and 0 <= ny <= M - 1 and arr[nx][ny] != 'X':
            if arr[nx][ny] == 'P':
                result += 1
            queue.append(Node(nx, ny))
            arr[nx][ny] = 'X'

if result == 0:
    print("TT")
else:
    print(result)
