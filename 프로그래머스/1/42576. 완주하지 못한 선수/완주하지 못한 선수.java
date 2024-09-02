import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i = 0;
        for(i = 0; i < completion.length; i++){
            if(!completion[i].equals(participant[i])){
                answer = participant[i];
                break;
            }
        }
        
        return participant[i];
    }
}