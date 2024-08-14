import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int lg=nums.length;
        Map<Integer,Integer>maps= new HashMap<>();
        
        for(int i=0;i<lg;i++){
            if(!maps.containsKey(nums[i])){
                maps.put(nums[i],1);
            }
        }
        if(maps.size()>lg/2){
            return lg/2;
        }
        else
            return maps.size();
    }
}