def solution(friends, gifts):
    n = len(friends)
    idx = {friends[i]: i for i in range(n)}

    give = [[0] * n for _ in range(n)]
    out_cnt = [0] * n
    in_cnt = [0] * n

    for g in gifts:
        a, b = g.split()
        ai = idx[a]
        bi = idx[b]
        give[ai][bi] += 1
        out_cnt[ai] += 1
        in_cnt[bi] += 1

    gift_index = [out_cnt[i] - in_cnt[i] for i in range(n)]
    next_recv = [0] * n

    for i in range(n):
        for j in range(i + 1, n):
            if give[i][j] > give[j][i]:
                next_recv[i] += 1
            elif give[i][j] < give[j][i]:
                next_recv[j] += 1
            else:
                if gift_index[i] > gift_index[j]:
                    next_recv[i] += 1
                elif gift_index[i] < gift_index[j]:
                    next_recv[j] += 1

    return max(next_recv)
