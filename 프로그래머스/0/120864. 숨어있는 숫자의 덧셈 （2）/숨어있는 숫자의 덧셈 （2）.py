def solution(my_string):
    total = 0
    
    #숫자덩어리 cur
    cur=""
    for ch in my_string:
        
        if(ord('0')<=ord(ch)<=ord('9')):
            cur+=ch
        else:
            if(cur!=""):
                total+=int(cur)
                cur=""
    
    if(cur!=""):
        total+=int(cur)
                
    
    return total