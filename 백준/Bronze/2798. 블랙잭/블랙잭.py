import sys
input=sys.stdin.readline

data=input().strip().split()
N=int(data[0])
M=int(data[1])
N_array=list(map(int,(input().strip().split())))
N_array.sort()
max_sum=0

for number in range(N):
    left=number+1
    right=N-1
    
    while left < right:
        current_sum=N_array[number]+N_array[left]+N_array[right]
        if current_sum < M:
            if current_sum > max_sum:
                max_sum=current_sum
            left+=1
        else:
            right-=1
        
        if current_sum ==M:
            max_sum=current_sum
            break
        
print(max_sum)