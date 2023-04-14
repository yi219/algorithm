def solution(today, terms, privacies):
    answer = []
    
    dterms = {}
    for term in terms:
        l = term.split(' ')
        dterms[l[0]] = l[1]

    dt = list(map(int, today.split('.')))   #오늘 날짜 리스트

    i = 1
    for privacy in privacies:
        p = privacy.split(' ')
        date = list(map(int, p[0].split('.')))
        t = int(dterms[p[1]])    #해당 개인정보 보관 유효기간
        y = t//12
        m = t%12
        date[0] += y
        date[1] += m
        if (date[1] > 12):
            date[0] += 1
            date[1] -= 12
        date[2] -= 1
        if (date[2] == 0):
            date[1] -= 1
            date[2] = 28
        
        print(date)
        
        if (dt[0]>date[0]):
            answer.append(i)
        elif (dt[0]==date[0]):
            if(dt[1]>date[1]):
                answer.append(i)
            elif(dt[1]==date[1]):
                if(dt[2]>date[2]):
                    answer.append(i)
        i += 1
    
    
    return answer