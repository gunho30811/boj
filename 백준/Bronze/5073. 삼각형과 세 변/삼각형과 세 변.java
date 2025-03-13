import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
    	
    	int A=-1;
    	int B=-1;
    	int C=-1;
    	int max;
    	boolean Iso;
    	BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
    	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

    	while(true) {
        	
        	StringTokenizer st= new StringTokenizer(br.readLine());
        	
        	A= Integer.parseInt(st.nextToken()); //세로
        	B= Integer.parseInt(st.nextToken()); //가로
        	C= Integer.parseInt(st.nextToken()); //세로
    		
        	max=Amax(A,B,C);
        	Iso=AIso(A,B,C);
    		if(A==0&B==0&C==0) {
    			bw.flush();
    			break;
    		}
    		else {
    			if(A==B&&B==C && A==C) bw.write("Equilateral"+"\n");
    			else if(max<A+B+C-max && Iso==false) {
    				bw.write("Scalene"+"\n");
    			}
    			else if(max<A+B+C-max && Iso==true){
    				bw.write("Isosceles"+"\n");
    			}
    			else bw.write("Invalid"+"\n");
    		
    		}
    	}
    

    	
    }
    
    public static int Amax(int a, int b ,int c) {
    	
    	int max= Math.max(a, b);
    	max=Math.max(max, c);
    	
    	return max;
    }
    
    public static boolean AIso(int a, int b ,int c) {
    	
    	
    	if(a==b&&b==c&&a==c) return false;
    	
    	if(a==b || a==c || c==b) {
    		return true;
    	}
    	return false;
    	
    	
    } 
    
}
