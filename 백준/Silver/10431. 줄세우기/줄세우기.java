import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int P = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
        
        StringBuilder sb = new StringBuilder();
        
        for (int t = 0; t < P; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int testCaseNumber = Integer.parseInt(st.nextToken()); // 테스트 케이스 번호
            
            int[] students = new int[20]; // 20명의 학생 키 저장
            for (int i = 0; i < 20; i++) {
                students[i] = Integer.parseInt(st.nextToken());
            }
            
            int moves = 0; // 이동 횟수 카운트
            
            List<Integer> line = new ArrayList<>(); // 정렬된 줄 (ArrayList 사용)
            
            for (int height : students) {
                int index = 0;
                
                // 현재 학생의 키가 삽입될 위치 찾기
                while (index < line.size() && line.get(index) < height) {
                    index++;
                }
                
                // 이동 횟수는 index부터 끝까지의 사람 수
                moves += (line.size() - index);
                
                // 학생을 올바른 위치에 삽입
                line.add(index, height);
            }
            
            sb.append(testCaseNumber).append(" ").append(moves).append("\n");
        }
        
        System.out.print(sb);
    }
}
