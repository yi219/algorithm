case = int(input())    #테스트케이스의 수

for i in range(case):
    n, m = map(int, input().split())    #문서의 개수 n, 목표 문서의 현재 인덱스 m
    l = list(map(int, input().split()))

    count = 0

    while (len(l) != 0):
        max_p = max(l)  #가장 중요한 문서의 중요도
        max_i = l.index(max_p)  #가장 중요한 문서의 인덱스

        if (l[0] < max_p):  #현재 문서보다 중요도가 높은 문서가 있는 경우
            l.append(l[0])
            del l[0]
            if (m == 0):
                m = len(l)-1
            else:
                m -= 1
        else:   #현재 문서가 가장 중요도가 높은 경우
            if(max_i == m): #m 인쇄
                count += 1
                break
            else:
                del l[0]
                count += 1
                m -= 1
                
    print(count)

