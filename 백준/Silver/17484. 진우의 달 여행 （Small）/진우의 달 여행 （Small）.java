import java.io.*;
import java.util.*;
public class Main {
    
	static boolean [][]visited;
	static int[][] map;
	static int N;
	static int M;
    static int min=Integer.MAX_VALUE;
    
    //좌
    static int[]dx= {1,1,1};
    static int[]dy= {-1,0,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map= new int[N][M];
        visited= new boolean[N][M];
        
        for(int i=0;i<N;i++) {
        	st= new StringTokenizer(br.readLine());
        	for(int j=0;j<M;j++) {
        		map[i][j]=Integer.parseInt(st.nextToken());
        	}
        }
        
        for(int i=0;i<M;i++) {
        	int prev=-2;
        	dfs(0,i,map[0][i],prev);
        
        }
        	
        System.out.println(min);

        	
      }
        
    public static void dfs (int x,int y , int sum, int prev) {
    	
    	
    	if(sum>=min) return;
    	if(sum<min && x==N-1) {
    		min=sum;
    		return;
    	} 
    	    	
    	for(int i=0;i<3;i++) {
    		
    		if(prev==i) continue;
    		
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (ny < 0 || ny >= M) continue; // 범위 벗어나면 skip
    		
        	dfs(nx,ny,sum+ map[nx][ny],i);
    	}
    	    	
    	
    	
    }
    
}




