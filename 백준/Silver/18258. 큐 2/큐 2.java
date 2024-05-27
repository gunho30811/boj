import java.io.*;
import java.util.*;

public class Main{
    
    
    public static void main (String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> nameque= new ArrayDeque<>();
        StringBuilder sb= new StringBuilder();
        
        for(int i=0;i<N;i++){
            String command=br.readLine();
            if(command.startsWith("push")){
                int value = Integer.parseInt(command.split(" ")[1]);
                nameque.add(value);
            }
            else if(command.equals("pop")){
                if(nameque.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(nameque.poll()).append("\n");
                }   
            }
            else if(command.equals("size")){
                sb.append(nameque.size()).append("\n");
            }
            else if(command.equals("empty")){
                sb.append(nameque.isEmpty() ? 1:0).append("\n");
            }
            else if(command.equals("front")){
                if(nameque.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(nameque.peek()).append("\n");
                }
                
            }
            else if(command.equals("back")){
                if(nameque.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(nameque.peekLast()).append("\n");
                }
            }
        }
        System.out.print(sb.toString());
        br.close();
        
    }
}