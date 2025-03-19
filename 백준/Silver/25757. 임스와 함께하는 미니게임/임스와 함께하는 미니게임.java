import java.io.*;
import java.util.*;

public class Main {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		int N=Integer.parseInt(st.nextToken());
		String game=st.nextToken();
		Set<String> name =new HashSet<>();
		
		for(int i=0;i<N;i++) {
			st=new StringTokenizer(br.readLine());
			name.add(st.nextToken());
			
		}
		int k= name.size();
		int result=0;
		if(game.equals("Y")) {
			result=k/1;
		}
		if(game.equals("F")) {
			result=(int)(Math.floor(k/2.0));
		}
		if(game.equals("O")) {
			result=(int)(Math.floor(k/3.0));
		}
		
			System.out.println(result);
		}

	}
	
	
