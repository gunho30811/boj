import java.io.*;
import java.util.*;

public class Main {
	
	static StringBuilder sb= new StringBuilder();
	static int[] T, P;
	static int maxProfit=0;

    public static void main(String[] args) throws IOException {
    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int N=Integer.parseInt(br.readLine());
    	
    	T= new int[N+1];
    	P= new int[N+1];

    	
    	for(int i=1;i<=N;i++) {
    		String[]input=br.readLine().split(" ");
    		T[i]=Integer.parseInt(input[0]);
    		P[i]=Integer.parseInt(input[1]);
    	}
    	
    	dfs(1,0,N);
    	System.out.println(maxProfit);
    }
    
    static void dfs(int day, int profit, int N) {
    	
    	if(day >=N+1) {
    		maxProfit=Math.max(maxProfit, profit);
    		return;
    	}
        if (day <= N && day + T[day] <= N + 1) {
    		dfs(day + T[day], profit+ P[day], N);
    	}
    	
    	dfs(day+1,profit,N);
    }
    


}
