import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // N이 K보다 크거나 같으면 -1만 하면 되므로 바로 출력
        if (N >= K) {
            System.out.println(N - K);
            return;
        }

        System.out.println(bfs(N, K));
    }

    static int bfs(int start, int target) {
        Queue<Node> queue = new LinkedList<>();
        boolean[] visited = new boolean[100001];

        queue.offer(new Node(start, 0));
        visited[start] = true;

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.location == target) {
                return current.depth;
            }

            // 이동 가능한 경우의 수
            int[] nextMoves = {current.location - 1, current.location + 1, current.location * 2};

            for (int next : nextMoves) {
                if (next >= 0 && next <= 100000 && !visited[next]) {
                    visited[next] = true;
                    queue.offer(new Node(next, current.depth + 1));
                }
            }
        }

        return -1;
    }

    static class Node {
        int location;
        int depth;

        Node(int location, int depth) {
            this.location = location;
            this.depth = depth;
        }
    }
}
