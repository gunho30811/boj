def solution(board):
    
    chk1arr=[]
    n=len(board)
    
    for y,row in enumerate(board):
        for x,val in enumerate(row):
            if(val!=0):
                chk1arr.append([x,y])
    
    danger=[n*[0] for _ in range(n)]
    
    dirs=[
        [-1,-1],[0,-1],[1,-1],
        [-1,0],[0,0],[1,0],
        [-1,1],[0,1],[1,1]
    ]
    
    for x,y in chk1arr:
        danger[y][x]=1
        for dx, dy in dirs:
            nx=x+dx
            ny=y+dy
            #중복으로 1을 바꾸는 거 같으니, 조건으로 danger[nx,ny] 일때는 굳이 로직을 타지 않게 해도 될 것 같다.
            if(0<=nx<n and 0<=ny<n):
                danger[ny][nx]=1
                
    cnt=sum(row.count(0) for row in danger)
    
    cnt=0
    
    for row in danger:
        for val in row:
            if(val==0):
                cnt+=1

    return cnt