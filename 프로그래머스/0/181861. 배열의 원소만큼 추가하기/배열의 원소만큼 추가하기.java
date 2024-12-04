import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i]; j++){
                list.add(arr[i]);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int k = 0; k < answer.length; k++){
            answer[k] = list.get(k);
        }
        
        return answer;
    }
}