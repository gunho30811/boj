def solution(s):
    transform_count = 0
    removed_zeros = 0

    while s != "1":
        zeros = s.count('0')
        removed_zeros += zeros

        ones_len = len(s) - zeros  # 0 제거 후 길이
        s = bin(ones_len)[2:]      # 길이를 2진 문자열로 변환

        transform_count += 1

    return [transform_count, removed_zeros]
