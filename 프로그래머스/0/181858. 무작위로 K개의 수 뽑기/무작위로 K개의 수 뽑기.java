import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        for(int a = 0; a < answer.length; a++){
            answer[a] = -1;
        }
        HashSet<Integer> set = new HashSet<>();
        
        int num = 0;
        for(int i = 0; i < arr.length; i++) {
            if(set.size() == k){
                break;
            }
            
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                answer[num] = arr[i];
                num++;
            }
        }
        return answer;
    }
}