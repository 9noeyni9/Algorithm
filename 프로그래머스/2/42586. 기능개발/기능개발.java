import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        int time = (int)Math.ceil((100.0 - progresses[0]) / speeds[0]);
        int count = 1;
        for(int i = 1; i < progresses.length; i++){
            int comparativeTime = (int)Math.ceil((100.0 - progresses[i]) / speeds[i]);
            if(time < comparativeTime){
                time = comparativeTime;
                list.add(count);
                count = 1;
            }else{
                count++;
            }
        }
        list.add(count);
        
        int[] answer = new int[list.size()];
        
        for(int j = 0; j < answer.length; j++){
            answer[j] = list.get(j);
        }
        return answer;
    }
}