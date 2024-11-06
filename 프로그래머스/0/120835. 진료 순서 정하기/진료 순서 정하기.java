import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < emergency.length; i++){
            map.put(emergency[i], i+1);
        }
    
        Arrays.sort(emergency);
        int k = 0;
        for(int j = emergency.length-1; j >= 0; j--){
            int solution = map.get(emergency[j]);
            answer[solution-1] = k+1;
            k++;
        }
        return answer;
    }
}