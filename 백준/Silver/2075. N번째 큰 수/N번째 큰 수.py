import sys
import heapq
input=sys.stdin.readline

N=int(input().strip())
heap=[]

for _ in range(N):
    A=map(int,input().split())
    for i in A:
        if len(heap)<N:
            heapq.heappush(heap, i)
        else:
            heapq.heappushpop(heap, i)
            
print(heapq.heappop(heap))
        
    
    