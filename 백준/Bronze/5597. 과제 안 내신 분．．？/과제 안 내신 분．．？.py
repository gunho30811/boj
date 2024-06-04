N=[i for i in range(1,31)]

for _ in range(28):
    data=int(input())
    N.remove(data)

print(min(N))        
print(max(N))



