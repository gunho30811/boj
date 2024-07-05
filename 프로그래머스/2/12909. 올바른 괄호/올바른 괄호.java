import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] arr =s.split("");
        Deque<String> deq = new ArrayDeque<>();
        int cnt=0;
        for(String str:arr){
            if(str.equals("(")){
                deq.push(str);
                cnt++;
                // System.out.println(cnt+"push");
            }
            else if(str.equals(")")){
                if(deq.isEmpty()){
                    // System.out.println(cnt+"pop");
                    return false;
                }
                deq.pop();
                cnt--;
                // System.out.println(cnt+"result");
            }
            
            
        }
        if(cnt==0) return true;
        
        return false;
    }
}