class Solution {
    public String solution(String s) {
        String [] Str_number=s.split(" ");
        int [] int_number=new int[Str_number.length];
        for(int i=0;i<Str_number.length;i++){
            int_number[i]=Integer.parseInt(Str_number[i]);    
        }
        int min=int_number[0];
        int max=int_number[0];
        
        for(int num : int_number){
            if(num>max) max=num;
            if(num<min) min=num;
        }
        return ""+min+" "+max;
    }
}