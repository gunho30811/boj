import sys
def count_times_with_k(N, K):
    count = 0
    K = str(K)  # 숫자 K를 문자열로 변환
    
    for hour in range(N + 1):
        for minute in range(60):
            for second in range(60):
                # 현재 시각을 문자열로 변환
                current_time = f"{hour:02d}{minute:02d}{second:02d}"
                if K in current_time:
                    count += 1
    return count

# 예시 입력
N,K=map(int,input().split())

result= count_times_with_k(N, K)
print(result)