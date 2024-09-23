import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for(int i = citations.length-1; i >=0; i--){
            if(citations[citations.length-1 - i] >= i+1){
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}