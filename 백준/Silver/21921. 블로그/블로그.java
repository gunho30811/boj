import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N= Integer.parseInt(st.nextToken());
        int M= Integer.parseInt(st.nextToken());
        int [] arr=new int[N+1];
        arr[0]=-1;
        st = new StringTokenizer(br.readLine());
        int sum=0;
        int maxsum=-1;
        int cnt=0;
        int count=0;
        
        for(int i=1;i<=N;i++) {
        	
        	arr[i]=Integer.parseInt(st.nextToken());
        	
        	//숫자 작은 인덱스 빼기
        	if(cnt==M && (i-M)>0) {
        		sum-=arr[i-M];
        		cnt--;
        	}
        	
        	//숫자 큰 인덱스 넣기
        	if(cnt<M) {
        		sum+=arr[i];
        		if(maxsum<sum) { maxsum=sum; count=1;}
        		else if(maxsum==sum) count++;
        		
        		cnt++;
        	}
        	
        }
                
        
        if(maxsum==0) System.out.print("SAD");
        if(maxsum!=0) {
        	StringBuilder sb= new StringBuilder();
        	sb.append(maxsum);
        	sb.append("\n");
        	sb.append(count);
        	System.out.println(sb);
        }
        
        
    }
}
