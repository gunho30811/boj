def solution(my_string):
    
    #cur은 숫자덩어리
    cur=""
    #total은 result 할 총합 수
    total = 0    
    for ch in my_string:
        if(ord('0') <= ord(ch) <= ord('9')):
            cur+=ch
        else:
            if(cur!=""):
                total+=int(cur)
                cur=""
    #마지막 숫자덩어리가 모인경우 ex-> ABC123
    if(cur!=""):
        total+=int(cur)

    return total