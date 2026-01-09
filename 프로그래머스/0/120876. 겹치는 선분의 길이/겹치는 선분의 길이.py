def solution(lines):
    
    
    arr=[0]*201

    
    for start,end in lines:
        for i in range(start+1,end+1):
            if(arr[i+100]==0):
                arr[i+100]=1
            elif(arr[i+100]==1):
                arr[i+100]=2
                
    
    return arr.count(2)


        