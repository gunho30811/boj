
import java.io.*;
import java.util.*;

public class Main {

    static class Document{
        int index;
        int priority;

        Document(int index, int priority){
            this.index = index;
            this.priority = priority;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());

        for(int t=0;t<T;t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N=Integer.parseInt(st.nextToken());
            int order=Integer.parseInt(st.nextToken());
            Queue<Document> queue = new LinkedList<>();
            PriorityQueue<Integer> priorities = new PriorityQueue<>(Collections.reverseOrder());


            st= new StringTokenizer(br.readLine());
            int[] arr = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = Integer.parseInt(st.nextToken());
                int priority =arr[i];
                queue.offer(new Document(i, priority));
                priorities.offer(priority);
            }
            int printOrder=0;

            while(!queue.isEmpty()){
                Document current = queue.poll();
                if(current.priority == priorities.peek()){
                    printOrder++;
                    priorities.poll();
                    if(current.index == order){
                        System.out.println(printOrder);
                        break;
                    }
                }else{
                    queue.offer(current);
                }
            }

        }
        br.close();
    }
}
