import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
    	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    	
    	int N= Integer.parseInt(br.readLine());
    	
    	Deque<Integer> que=new ArrayDeque<>();
    	// 1 2 3 4 5
    	// 2 3 4 5
    	// 3 4 5 2
    	// 4 5 2
    	// 5 2 4
    	// 2 4
    	// 4 2
    	// 2
    	
    	for(int i=1;i<=N;i++) {
    		que.add(i);
    	}
    	
    	boolean visit=false;
    	while(!que.isEmpty()) {
    		
    		if(que.size()==1) break;
    		if (!visit) {
    		    que.pollFirst(); // 큐에서 꺼내면서 제거
    		    visit = true;
    		}
    		if(que.size()==1) break;
    		if(visit) {
    			que.add(que.pollFirst());
    			visit=false;
    		}
    		
    	}

    	System.out.println(que.peek());
    	
    	}
    	
    	
    	
    	
    }
  
    
 
