import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[^0-9]","");
        int[] answer = new int[my_string.length()];
        for(int i = 0; i < answer.length; i++){
            char chr = my_string.charAt(i);
            answer[i] = Integer.parseInt(chr+"");
        }
        Arrays.sort(answer);
        return answer;
    }
}