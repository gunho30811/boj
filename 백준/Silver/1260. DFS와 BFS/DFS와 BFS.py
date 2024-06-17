from collections import defaultdict, deque

def dfs(graph, start, visited):
    visited.append(start)
    for neighbor in sorted(graph[start]):
        if neighbor not in visited:
            dfs(graph, neighbor, visited)

def bfs(graph, start):
    visited = []
    queue = deque([start])
    while queue:
        node = queue.popleft()
        if node not in visited:
            visited.append(node)
            queue.extend(sorted(graph[node]))
    return visited

def main():
    # 입력 받기
    n, m, v = map(int, input().split())
    graph = defaultdict(list)
    
    for _ in range(m):
        a, b = map(int, input().split())
        graph[a].append(b)
        graph[b].append(a)
    
    # DFS 결과 출력
    dfs_visited = []
    dfs(graph, v, dfs_visited)
    print(' '.join(map(str, dfs_visited)))
    
    # BFS 결과 출력
    bfs_visited = bfs(graph, v)
    print(' '.join(map(str, bfs_visited)))

main()
