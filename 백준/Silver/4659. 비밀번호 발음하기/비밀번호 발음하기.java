import java.io.*;
import java.util.*;

public class Main {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			String tc = br.readLine();

			if(tc.equals("end")) break;
			
			boolean rule1=false;
			boolean rule2=true;
			boolean rule3=true;
			int cntja = 0;
			int cntmo = 0;
			
			char prev='!';
			for(char ch: tc.toCharArray()) {
				
				if(ch==prev) {
					rule3=false;
					if(ch=='e') rule3=true;
					if(ch=='o') rule3=true;
				}
				
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					rule1=true;
					cntmo+=1;
					cntja=0;
				}
				else {
					cntmo=0;
					cntja+=1;
				}
				
				if(cntmo==3 || cntja==3) {
					rule2=false;
				}
				
				prev=ch;
				
				
			}
			
			if(rule1==true && rule2==true && rule3==true) {
				System.out.println("<"+tc+">"+" is acceptable.");
			}else {
				System.out.println("<"+tc+">"+" is not acceptable.");
			}

			
			
		}

	}
	
	
}
