import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int area=brown+yellow;
        
        for(int x=3;x<=area/x;x++){
            
            if(area%x==0){
                int y=area/x;
                if((x-2)*(y-2)==yellow){
                    return new int[] {y,x};
                }
            }
            
        }
        
        return new int[]{0,0};
    }
}