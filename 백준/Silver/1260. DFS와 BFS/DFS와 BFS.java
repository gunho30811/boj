import java.util.*;
import java.io.*;

public class Main {
    static List<List<Integer>> list = new ArrayList<>();
    static boolean[] visited;
    static boolean[] visited2;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] parts = input.split(" ");
        int N = Integer.parseInt(parts[0]);
        int M = Integer.parseInt(parts[1]);
        int V = Integer.parseInt(parts[2]);

        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        visited = new boolean[N + 1];  // 노드의 개수는 N이므로 N+1 크기로 초기화
        visited2 = new boolean[N + 1]; 

        for (int i = 0; i < M; i++) {
            String[] line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            list.get(a).add(b);
            list.get(b).add(a);
        }

        for (List<Integer> neighbors : list) {
            Collections.sort(neighbors);
        }

        // DFS 실행
        dfs(V);
        System.out.println(sb.toString().trim());  // DFS 결과 출력
        sb.setLength(0);  // StringBuilder 초기화

        // BFS 실행
        bfs(V);
        System.out.println(sb.toString().trim());  // BFS 결과 출력
    }

    public static void dfs(int V) {
        visited[V] = true;
        sb.append(V).append(" ");

        for (int i = 0; i < list.get(V).size(); i++) {
            int nextNode = list.get(V).get(i);
            if (!visited[nextNode]) {
                dfs(nextNode);
            }
        }
    }

    public static void bfs(int V) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(V);
        visited2[V] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            sb.append(current).append(" ");

            for (int nextNode : list.get(current)) {
                if (!visited2[nextNode]) {
                    queue.add(nextNode);
                    visited2[nextNode] = true;
                }
            }
        }
    }
}
