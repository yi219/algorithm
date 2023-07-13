t = int(input())
for i in range(t):
    date = input()
    year = int(''.join(date[:4]))
    month = int(''.join(date[4:6]))
    day = int(''.join(date[6:]))
    thyone = [1,3,5,7,8,10,12]
    thy = [4,6,9,11]
    if month > 0 and month < 13:
        if month in thyone and day > 0 and day < 32:
            print('#', i+1, ' ', ''.join(date[:4]), '/', ''.join(date[4:6]), '/', ''.join(date[6:]), sep='')
        elif month in thy and day > 0 and day < 31:
            print('#', i+1, ' ', ''.join(date[:4]), '/', ''.join(date[4:6]), '/', ''.join(date[6:]), sep='')
        elif month == 2 and day > 0 and day < 29:
            print('#', i+1, ' ', ''.join(date[:4]), '/', ''.join(date[4:6]), '/', ''.join(date[6:]), sep='')
        else:
            print('#', i+1, ' ', -1, sep='')
    else:
        print('#', i+1, ' ', -1, sep='')
