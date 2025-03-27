import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int N= Integer.parseInt(st.nextToken());
        int K= Integer.parseInt(st.nextToken());
        
        char[] arr = br.readLine().toCharArray();
        boolean[] eaten = new boolean[N]; // 햄버거 먹혔는지 여부
        
        int count = 0;
        
        for (int i = 0; i < N; i++) {
            if (arr[i] == 'P') {
                // 왼쪽부터 우선 탐색
                for (int j = i - K; j <= i + K; j++) {
                    if (j < 0 || j >= N) continue;
                    if (arr[j] == 'H' && !eaten[j]) {
                        eaten[j] = true;
                        count++;
                        break;
                    }
                }
            }
        }
        
        System.out.println(count);
    }
}
