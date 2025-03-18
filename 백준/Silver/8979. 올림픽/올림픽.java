import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] array = new int[N + 1][5];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            int Knum = Integer.parseInt(st.nextToken());
            array[i][0] = Knum; // 국가 번호
            array[i][1] = Integer.parseInt(st.nextToken()); // 금메달
            array[i][2] = Integer.parseInt(st.nextToken()); // 은메달
            array[i][3] = Integer.parseInt(st.nextToken()); // 동메달
            array[i][4] = i; // 초기 등수
        }

        // ✅ 순위를 올바르게 매기기 위한 정렬
        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                // 금메달 비교
                if (array[i][1] < array[j][1] ||
                    (array[i][1] == array[j][1] && array[i][2] < array[j][2]) ||
                    (array[i][1] == array[j][1] && array[i][2] == array[j][2] && array[i][3] < array[j][3])) {
                    
                    // 배열 값 교환 (swap)
                    int[] temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        // ✅ 순위 계산 (공동 순위 처리)
        int rank = 1;
        array[1][4] = rank;

        for (int i = 2; i <= N; i++) {
            if (array[i][1] == array[i - 1][1] &&
                array[i][2] == array[i - 1][2] &&
                array[i][3] == array[i - 1][3]) {
                array[i][4] = array[i - 1][4]; // 공동 등수 유지
            } else {
                rank = i; // 새로운 등수는 i번째 위치
                array[i][4] = rank;
            }
        }

        for (int i = 1; i <= N; i++) {
            if (array[i][0] == K) {
                System.out.println(array[i][4]);
                break;
            }
        }
    }
}
