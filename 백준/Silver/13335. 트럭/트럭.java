import java.io.*;
import java.util.*;
public class Main {
//		4 2 10 
//		7 4 5 6
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int w= Integer.parseInt(st.nextToken());
        int l= Integer.parseInt(st.nextToken());
        
        int [] truckWeight= new int[n+1];
        int time=0;
        
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
        	truckWeight[i]=Integer.parseInt(st.nextToken());
        }
        
        Deque<Integer>que= new ArrayDeque<>();
        
        for(int i=0;i<w;i++) {
        	que.offer(0);
        	// 큐는 무게 측정용 최대 2개 확인하니 2개만 넣기
        }
        int sumWeight=0;
        int idx=0;
       
        
       while(idx<n || sumWeight>0) {
    	   
    	   sumWeight-=que.poll();
    	   
    	   if(sumWeight+truckWeight[idx]<=l&&idx<n) {
    		  que.offer(truckWeight[idx]);
        	  sumWeight+=truckWeight[idx];
        	  idx++;
    	   }
    	   else {
    		   que.offer(0);
    	   }
    	   
    	 
    	   time++;
    	       	   
        	
       }
            
        
        System.out.println(time);

        }
        
        

    }

