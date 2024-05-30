import sys
import heapq

input=sys.stdin.readline

N=int(input().strip())
heap=[]

for _ in range(N):
    A = list(map(int, input().split()))
    for num in A:
        if len(heap)< N:
            heapq.heappush(heap, num)
        else:
            heapq.heappushpop(heap, num)

print(heapq.heappop(heap))
