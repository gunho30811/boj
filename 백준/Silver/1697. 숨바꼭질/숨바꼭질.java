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

        if (N >= K) {
            System.out.println(N - K); // 단순히 뒤로만 가면 되는 경우
            return;
        }

        int cnt = 0;
        while (N > K) {
            N /= 2;
            cnt++;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(N, cnt));

        boolean[] visited = new boolean[100001]; // 방문 체크 배열
        visited[N] = true;

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.location == K) {
                System.out.println(current.depth);
                return;
            }

            // 다음 이동 가능한 위치들
            int[] nextLocations = {current.location + 1, current.location - 1, current.location * 2};

            for (int next : nextLocations) {
                if (next >= 0 && next <= 100000 && !visited[next]) {
                    visited[next] = true;
                    queue.offer(new Node(next, current.depth + 1));
                }
            }
        }
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
