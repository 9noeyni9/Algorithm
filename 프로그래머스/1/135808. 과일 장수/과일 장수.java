import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int count = score.length / m;
        
        Arrays.sort(score);
        
        for(int i = 0; i < count; i++){
            answer += score[score.length - m*(i+1)] * m;
        }
        
        return answer;
    }
}