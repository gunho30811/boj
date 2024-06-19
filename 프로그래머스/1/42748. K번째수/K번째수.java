import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int s=0;s<commands.length;s++){
            int i=commands[s][0]; //i=2
            int j=commands[s][1]; //j=5
            int k=commands[s][2]; //k=3
            int[] temp = Arrays.copyOfRange(array, i-1, j);
            Arrays.sort(temp);
            answer[s]=temp[k-1];
        }

        return answer;
    }
}