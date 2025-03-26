import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<N;i++) {
        	String word=(br.readLine());
        	
        	if(word.length()>=M) {
        		map.put(word,map.getOrDefault(word,0)+1);
        	}
        }
        
        List<String> list= new ArrayList<>(map.keySet());
        
        list.sort((a,b) -> {
        	int freqA=map.get(a);
        	int freqB=map.get(b);
        	if(freqA!=freqB) return freqB-freqA;
        	if(a.length()!=b.length()) return b.length()-a.length();
        	return a.compareTo(b);
        	
        });
        StringBuilder sb = new StringBuilder();
        for (String word : list) {
            sb.append(word).append("\n");
        }

        System.out.print(sb);

        
    }
}
