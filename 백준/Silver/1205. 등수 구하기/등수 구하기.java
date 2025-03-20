import java.io.*;
import java.util.*;

public class Main {
		
	
		public static class result{
			long value;
			long rank;
			public result(long value, long rank){
				this.value=value;
				this.rank=rank;
			}
			
		}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		int N= Integer.parseInt(st.nextToken());
		long point = Long.parseLong(st.nextToken());
		int p=Integer.parseInt(st.nextToken());
		
	
		
		result [] re= new result[N+1];
		
		if(N==0) {
			System.out.println("1");
		}else {
		
		st=new StringTokenizer(br.readLine());		
		re[0]=new result(0,1);
		re[0].value=point;
		
		for(int i=1;i<=N;i++) {
		    re[i] = new result(0, 0);  // 객체를 생성해야 함
		    re[i].value = Integer.parseInt(st.nextToken());
		}

		int maxrank=-1;
		
		for(int i=0;i<=N;i++) {
			int rk=N+1;
			for(int j=0;j<=N;j++) {
				if(re[i].value>=re[j].value && i!=j) {
					rk--;
				}
			}
			re[i].rank=rk;
			if(rk>maxrank) maxrank=rk;
		}

		/*
		 * System.out.println(maxrank);
		 */		
		if(maxrank==re[0].rank && N>=p) {
			System.out.println("-1");
		}else {
			System.out.println(re[0].rank);

		}
		
		}
	}
	}
	
	
