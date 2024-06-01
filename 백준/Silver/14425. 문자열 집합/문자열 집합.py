import sys
input=sys.stdin.readline
data=input().split()
N=int(data[0])
M=int(data[1])
S=set()
cnt=0
for _ in range(N):
    S.add(input().strip())

for _ in range(M):
    com=input().strip()
    if com in S:
        cnt=cnt+1

print(cnt)
    