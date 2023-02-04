num = int(input())

count = 0

num -= 1
count += 1
i = 6

while (num > 0):
    num -= i
    i += 6
    count += 1

print(count)
