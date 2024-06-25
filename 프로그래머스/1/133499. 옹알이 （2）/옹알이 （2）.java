class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] baby = {"aya", "ye", "woo", "ma"};
        
        for (String babblings : babbling) {
            boolean isValid = true;
            for (String pattern : baby) {
                if (babblings.contains(pattern + pattern)) {
                    isValid = false;
                    break;
                }
            }
            
            if (!isValid) {
                continue;
            }
            
            for (String pattern : baby) {
                babblings = babblings.replace(pattern, " ");
            }
            
            babblings = babblings.replaceAll("\\s+", " ").trim();
            
            if (babblings.isEmpty()) {
                answer++;
            }
        }
        
        return answer;
    }
}