import java.io.*;
import java.util.*;

public class Main {
		
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		int N= Integer.parseInt(st.nextToken());
		int [] arr=new int[N+1];
		st=new StringTokenizer(br.readLine());
		arr[0]=0;
		for(int i=1;i<=N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		int Snum=Integer.parseInt(br.readLine());
		
		for(int i=0;i<Snum;i++) {
			st=new StringTokenizer(br.readLine());
			int stuSex=Integer.parseInt(st.nextToken());
			int getNum=Integer.parseInt(st.nextToken());
			
			if(stuSex==1) {
				int n= (int)Math.floor(N/getNum);
				for(int j=1;j<=n;j++) {
					arr[getNum*j] ^=1;	
				}
				
			}
			if(stuSex==2) {

				if(getNum!=1&&getNum<N) {
					int left=getNum-1; //2
					int right=getNum+1; //4
					int cnt=0;
					while(left>=1 && right<=N && arr[left]==arr[right]) {
						left--;
						right++;
						cnt++;
					}
					
					if(arr[left+1]==arr[right-1]) {
						for(int j=1;j<=cnt;j++) {
							arr[getNum+j] ^=1;
							arr[getNum-j] ^=1;

						}
						
					arr[getNum] ^=1;	
					}else arr[getNum] ^=1; 
					
				}
				else {
					arr[getNum] ^=1;
				}
				
			}
			
			
		}
		StringBuilder sb= new StringBuilder();
		
		for(int i=1;i<=N;i++) {
			sb.append(arr[i]+" ");
            if (i % 20 == 0) { // 20개마다 개행
                sb.append("\n");
            }
		}
		System.out.println(sb);
		
		
	}
}
	
	
