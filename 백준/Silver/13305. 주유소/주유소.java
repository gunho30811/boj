import java.io.*;
import java.util.*;

public class Main {
		
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N= Integer.parseInt(br.readLine());
		
		int [] dist= new int[N-1];
		int [] price= new int[N];
		
		StringTokenizer st= new StringTokenizer(br.readLine());
		for(int i=0;i<N-1;i++) {
			dist[i]=Integer.parseInt(st.nextToken());
		}
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			price[i]=Integer.parseInt(st.nextToken());
		}
		
		int minprice=0;
		int total=0;
		minprice=price[0];// 최초기름값
		for(int i=0;i<N-1;i++) {
			total+=minprice*dist[i];
			if(price[i+1]<minprice) {
				minprice=price[i+1];
			}

		}
		System.out.println(total);
	}
}
	
	
