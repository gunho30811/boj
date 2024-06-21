import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int n = progresses.length;
        int[] days = new int[n];
        
        for (int i = 0; i < n; i++) {
            days[i] = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }
        
        List<Integer> deployCounts = new ArrayList<>();
        int maxDay = days[0];
        int count = 1;
        
        for (int i = 1; i < n; i++) {
            if (days[i] <= maxDay) {
                // 앞선 기능이 배포될 때 함께 배포
                count++;
            } else {
                // 현재 기능이 앞선 기능보다 더 늦게 완료되면, 배포를 시작
                deployCounts.add(count);
                count = 1;
                maxDay = days[i];
            }
        }
        
        // 마지막 배포 집계 추가
        deployCounts.add(count);
        
        // List를 배열로 변환
        return deployCounts.stream().mapToInt(i -> i).toArray();
    }
}
