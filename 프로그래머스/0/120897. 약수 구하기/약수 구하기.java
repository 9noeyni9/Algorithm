import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0) {
                if(i != n/i){
                    list.add(i);
                    list.add(n/i);
                }else{
                    list.add(i);
                }
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int j = 0; j < answer.length; j++){
            answer[j] = list.get(j);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}