import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
    	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    	
    	int T= Integer.parseInt(br.readLine());
    	
    	for(int i=0;i<T;i++) {
        	StringTokenizer st=new StringTokenizer(br.readLine());    		
    		int idx=Integer.parseInt(st.nextToken());
    		int n=Integer.parseInt(st.nextToken());
    		  		
            String result = (isPrime(n) && isHappy(n)) ? "YES" : "NO";    		
            System.out.println(idx + " " + n + " " + result);
    	}
    	
    	
    	
    	
    }
    
    static boolean isPrime(int n) {
    	
    	if(n<2) return false;
    	
    	for(int i=2;i*i<=n;i++) {
    		if(n%i==0) return false;		
    	}
    	return true;
    }
    
    
    static boolean isHappy(int n) {
    	
    	Set<Integer> set= new HashSet<>();
    	while(n!=1) {
    		if(set.contains(n)) return false;    		
    		set.add(n);

    		int sum=0;
    		while(n>0) {
    			int d=n%10;
    			sum+=d*d;
    			n/=10;
    		}
    		n=sum;
    	}
    	
    	return true;
    }
        
    
    
}
