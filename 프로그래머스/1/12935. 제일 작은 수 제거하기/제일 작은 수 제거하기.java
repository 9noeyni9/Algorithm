import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : arr){
            list.add(num);
        }        
        Integer min = Collections.min(list);
        list.remove(min);
        int[] answer = new int[arr.length-1];
        for(int i =0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}