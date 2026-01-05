def solution(dots):
    def parallel(a, b, c, d):
        dx1 = b[0] - a[0]
        dy1 = b[1] - a[1]
        dx2 = d[0] - c[0]
        dy2 = d[1] - c[1]
        return dy1 * dx2 == dy2 * dx1  # 기울기 비교(교차곱)

    # 3가지 매칭을 모두 검사
    if parallel(dots[0], dots[1], dots[2], dots[3]): return 1
    if parallel(dots[0], dots[2], dots[1], dots[3]): return 1
    if parallel(dots[0], dots[3], dots[1], dots[2]): return 1
    return 0
