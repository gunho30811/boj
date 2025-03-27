import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static boolean[] finished;
    static int[] student;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            student = new int[n + 1];
            visited = new boolean[n + 1];
            finished = new boolean[n + 1];
            count = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                student[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 1; i <= n; i++) {
                if (!visited[i]) {
                    dfs(i);
                }
            }

            System.out.println(n - count); // 팀을 못 이룬 사람 수
        }
    }

    private static void dfs(int now) {
        visited[now] = true;
        int next = student[now];

        if (!visited[next]) {
            dfs(next);
        } else if (!finished[next]) {
            // 사이클 발생!
            for (int i = next; i != now; i = student[i]) {
                count++;
            }
            count++; // 자기 자신 포함
        }

        finished[now] = true;
    }
}
