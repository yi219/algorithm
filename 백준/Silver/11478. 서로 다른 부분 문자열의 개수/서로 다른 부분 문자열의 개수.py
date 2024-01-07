S = input()
length = len(S)

result = 0


for i in range(length):
    arr = []
    start = 0
    end = start + i
    while end < length:
        piece = S[start:end+1]
        if S[start:end+1] not in arr:
            arr.append(piece)
            result += 1
        start += 1
        end += 1

print(result)