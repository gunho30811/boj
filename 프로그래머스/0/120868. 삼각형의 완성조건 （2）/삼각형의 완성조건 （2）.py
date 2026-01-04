def solution(sides):
    sides.sort()
    Othside=[]
    #sides[1] 이 제일 긴 변인경우
    #새로운 변은 val보다 커야함
    val=sides[1]-sides[0]
    for i in range(sides[1]):
        if(val<i<=sides[1]):
            Othside.append(i)
            print(i)
    #새로운 변이 제일 길 경우
    #j는 sides[1]+sides[0] 보다 작아야함
    for j in range(sides[1]+sides[0]):
        if(sides[1]<j<sides[1]+sides[0]):
            Othside.append(j)
            print(j)
    
    
    return len(Othside)+1