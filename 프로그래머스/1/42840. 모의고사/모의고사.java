import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        int[] score = {0,0,0};
        for(int i = 0 ; i < answers.length; i++){
            score[0] += first[i % 5] == answers[i] ? 1 : 0;
            score[1] += second[i % 8] == answers[i] ? 1 : 0;
            score[2] += third[i % 10] == answers[i] ? 1 : 0;
        }
        
        int max = Math.max(score[0],Math.max(score[1],score[2]));
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int j = 0; j < score.length; j++){
            if(max == score[j]) list.add(j+1);
        }
        
        int[] answer = new int[list.size()];
        for(int k = 0; k < answer.length; k++){
            answer[k] = list.get(k);
        }
        return answer;
    }
}