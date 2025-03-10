from collections import deque
import sys

# 입력 받기
n, w, l = map(int, sys.stdin.readline().split())
trucks = list(map(int, sys.stdin.readline().split()))

# 다리 상태를 나타내는 큐
bridge = deque([0] * w)  # 다리 길이 w만큼 0으로 초기화
bridge_weight = 0  # 현재 다리 위 트럭의 총 무게
time = 0  # 경과 시간
idx = 0  # 다음에 올라갈 트럭 인덱스

while idx < n or bridge_weight > 0:
    # 1. 다리에서 트럭이 나감
    bridge_weight -= bridge.popleft()

    # 2. 새로운 트럭이 올라갈 수 있는지 확인
    if idx < n and bridge_weight + trucks[idx] <= l:
        bridge.append(trucks[idx])
        bridge_weight += trucks[idx]
        idx += 1
    else:
        bridge.append(0)  # 트럭이 못 올라가면 빈 공간 유지

    time += 1  # 1초 경과

# 결과 출력
print(time)
