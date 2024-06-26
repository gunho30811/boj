class Solution {
    public int solution(String[] babbling) {
        String [] baby={"aya","ye","woo","ma"};
        int answer=0;
        
        for(String babblings: babbling){
            
            for(String pattern : baby){
                babblings=babblings.replace(pattern," ");
            }
            babblings= babblings.replace(" ","");
            if(babblings.isEmpty()){
                answer++;
            }
        }
    return answer;
    }
}