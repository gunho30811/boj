import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        String [] baby={"aya","ye","woo","ma"};
        int answer=0;
        
        for(String babblings: babbling){
            
            for(String babys:baby){
                System.out.println(babys);
                babblings=babblings.replace(babys," ");
                System.out.println(babblings);
            }
            babblings=babblings.replace(" ","");
            if(babblings.isEmpty()){
                answer++;
            }
        }
        
        
        return answer;
    }
}