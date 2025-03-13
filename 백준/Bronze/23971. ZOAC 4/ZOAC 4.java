import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
    	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st= new StringTokenizer(br.readLine());
    	
    	int H= Integer.parseInt(st.nextToken());
    	int W= Integer.parseInt(st.nextToken());
    	int N= Integer.parseInt(st.nextToken());
    	int M= Integer.parseInt(st.nextToken());
    	
    	int HN=(int)Math.ceil(H/(double)(N+1));
    	int WM=(int)Math.ceil(W/(double)(M+1));

    	
   
    	
    	System.out.println(HN*WM);
    	
    	

    	
    }
}
