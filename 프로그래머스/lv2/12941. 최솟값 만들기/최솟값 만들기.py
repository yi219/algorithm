def solution(A,B):
    answer = 0
    #누적 최솟값 구하기

    A.sort()
    B.sort(reverse=True)

    for i in range(len(A)):
        answer += A[i]*B[i]
        

    return answer