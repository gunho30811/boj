T=int(input())
for _ in range(T):
    Trash=input()
    a=[]
    a=list(map(int, input().split()))
    print(min(a), max(a))