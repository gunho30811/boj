import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N= Integer.parseInt(br.readLine());
		int cnt=0;
		StringTokenizer st= new StringTokenizer(br.readLine());		
		int [] arr=new int[101];
		for(int i=0;i<N;i++) {
			int say=Integer.parseInt(st.nextToken());
			
			if(arr[say]==0) arr[say]++;
			else cnt++;
			
		}
		System.out.println(cnt);
		
		

	}
}


