def solution(n):
    str_n = str(n);
    sorted_strn= "".join(sorted(str_n, reverse=True))
    return int(sorted_strn)