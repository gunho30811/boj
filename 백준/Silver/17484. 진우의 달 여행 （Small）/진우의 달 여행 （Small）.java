import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] map;
    static int min = Integer.MAX_VALUE;

    // 방향: 왼쪽아래(0), 아래(1), 오른쪽아래(2)
    static int[] dx = {1, 1, 1};
    static int[] dy = {-1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int j = 0; j < M; j++) {
            dfs(0, j, -1, map[0][j]);
        }

        System.out.println(min);
    }

    static void dfs(int x, int y, int prevDir, int sum) {
        if (sum >= min) return; // 가지치기

        if (x == N - 1) {
            min = Math.min(min, sum);
            return;
        }

        for (int d = 0; d < 3; d++) {
            if (d == prevDir) continue; // 같은 방향 연속 불가
            int nx = x + dx[d];
            int ny = y + dy[d];

            if (ny < 0 || ny >= M) continue; // 범위 벗어나면 skip

            dfs(nx, ny, d, sum + map[nx][ny]);
        }
    }
}
