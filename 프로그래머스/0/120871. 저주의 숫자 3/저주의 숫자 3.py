def solution(n):
    cnt = 0
    x = 0

    while cnt < n:
        x += 1
        if x % 3 == 0:
            continue
        if '3' in str(x):
            continue
        cnt += 1

    return x
