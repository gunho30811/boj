import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		
		int N=8;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int [] arr =new int[N];
		int [][] arr2 =new int[N][3]; //0은 값 1은 index 3은 visit
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			arr2[i][0]=arr[i];
			arr2[i][1]=i+1;
		}
		Arrays.sort(arr);
		int sum=0;
		int min=151;
		for(int i=0;i<5;i++) {
			int value=arr[i+3];
			sum+=value;
			if(min>value) {
				min=value;
			}
		}
		
		for(int i=0;i<N;i++) {
			
			if(arr2[i][0]>=min) {
				bw.write(arr2[i][1]+" ");
			}
		}
		
		System.out.println(sum);
		bw.flush();
		

	}
}


