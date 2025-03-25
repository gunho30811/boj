import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String S = br.readLine(); // 굴다리 길이
		int lg = S.length();
		char[] arr = new char[lg+1];
		int cnt = 0;
		for (char a : S.toCharArray()) {

			arr[cnt] = a;
			cnt++;
		}
		char b='a';
		for(int i=0;i<26;i++) {

			for(int j=0;j<lg+1;j++) {
				
				if(j==lg) {System.out.print(-1+" "); break;}

				
				if(arr[j]==b) {
					System.out.print(j+" ");
					break;
				}
			
				
			}

			
			b++;
		}
		
		

	}
}
