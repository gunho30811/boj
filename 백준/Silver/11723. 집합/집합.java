import java.util.*;
import java.io.*;



public class Main {

    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb= new StringBuilder();
    	int N=Integer.parseInt(br.readLine());
    	
    	Set<Integer> set = new HashSet<>();
    	
    	
    	for(int i=0;i<N;i++) {
        	StringTokenizer st=new StringTokenizer(br.readLine());

    		String cmd=st.nextToken();
    		int num=0;
    		
            if (!cmd.equals("all") && !cmd.equals("empty")) {
                num = Integer.parseInt(st.nextToken());
            }
    		
    		switch(cmd) {
    			
    			case "add":
    				if(!set.contains(num)) set.add(num);
    				break;
    			case "check":
    				if(set.contains(num)) sb.append("1\n");
    				else sb.append("0\n");
    				
    				break;
    			case "remove":
    				if(set.contains(num)) set.remove(num);
    				
    				break;
    			case "toggle":
    				if(set.contains(num)) set.remove(num);
    				else if(!set.contains(num)) set.add(num);
    				
    				break;
    			case "all":
    				set.clear();
    				for(int j=1;j<=20;j++) {
    					set.add(j);
    				}
    				
    				break;
    				
    			case "empty":
    				set.clear();
    				break;
    				
    			
    		}
    			
    	
    	}
        System.out.print(sb); // 한 번에 출력

    	
    }
    
    
}
