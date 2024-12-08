import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        int lg=phone_book.length;
        Arrays.sort(phone_book);
        for(int i=0;i<lg-1;i++){
            String comp=phone_book[i];
            if(phone_book[i+1].startsWith(comp)) return false;
        }
        
        return true;
    }
}