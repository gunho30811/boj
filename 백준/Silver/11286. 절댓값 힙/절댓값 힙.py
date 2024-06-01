import sys
import heapq
input=sys.stdin.readline
N=int(input().strip())
heap=[]

for _ in range(N):
    Num=int(input().strip())
    if Num==0:
        if heap:
            print(heapq.heappop(heap)[1])
        else:
            print(0)
    else:
        heapq.heappush(heap, (abs(Num), Num))
    