import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st= new StringTokenizer(br.readLine());
    	int N= Integer.parseInt(st.nextToken());
    	int K= Integer.parseInt(st.nextToken());
        int[] dp = new int[K + 1];
    	
    	int []value=new int[N];
    	int []Weight=new int[N];
    	
    	for (int i=0;i<N;i++) {
    		st=new StringTokenizer(br.readLine());
    		Weight[i]= Integer.parseInt(st.nextToken());
    		value[i]= Integer.parseInt(st.nextToken());
    	}
        for (int i = 0; i < N; i++) {
            for (int w = K; w >= Weight[i]; w--) { 
                dp[w] = Math.max(dp[w], dp[w - Weight[i]] + value[i]);
            }
        }

        System.out.println(dp[K]);

    }

}