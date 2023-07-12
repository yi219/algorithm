t = int(input())
for i in range(t):
    result = True
    sudoku = list(list(map(int, input().split())) for _ in range(9))
    nsudoku = list(map(list, zip(*sudoku)))
    
    for s in sudoku:
        if len(set(s)) != 9:
            result = False
            break
    if result == True:
        for ns in nsudoku:
            if len(set(ns)) != 9:
                result = False
                break
    if result == True:
        nine = []
        for k in range(3):
            nine.append(sudoku[k*3][0:3] + sudoku[k*3+1][0:3] + sudoku[k*3+2][0:3])
            nine.append(sudoku[k*3][3:6] + sudoku[k*3+1][3:6] + sudoku[k*3+2][3:6])
            nine.append(sudoku[k*3][6:9] + sudoku[k*3+1][6:9] + sudoku[k*3+2][6:9])
        for n in nine:
            if len(set(n)) != 9:
                result = False
    if result == True:
        print('#', i+1, ' ', '1', sep = '')
    else:
        print('#', i+1, ' ', '0', sep = '')
