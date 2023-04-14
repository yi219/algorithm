def solution(name, yearning, photo):
    
    l = [name, yearning]
    
    point = dict(zip(*l))
    answer = []

    for i in range(len(photo)):
        sum = 0
        for person in photo[i]:
            if person in point:
                sum += point[person]
        answer.append(sum)
    
    
    return answer