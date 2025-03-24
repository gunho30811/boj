import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //굴다리 길이
        int M = Integer.parseInt(br.readLine()); //가로등 개수
        StringTokenizer st=new StringTokenizer(br.readLine());
        int [] x=new int[M];
        int start=0;
        int end=N;
        double middle=-1;
        
        for(int i=0;i<M;i++) {
        	
        	x[i]=Integer.parseInt(st.nextToken());
        	
        }
        
        end=N-x[M-1];
        start=x[0];
        
        for(int i=0;i<M;i++) {
        	
        	if(i>0 && middle<x[i]-x[i-1]) {
        		middle=x[i]-x[i-1];
        	}
        	
        }
        middle= Math.ceil(middle/2.0);
        int result= Math.max(end, Math.max(start,(int)middle));
        
        System.out.println(result);
        

        
        }
    }

