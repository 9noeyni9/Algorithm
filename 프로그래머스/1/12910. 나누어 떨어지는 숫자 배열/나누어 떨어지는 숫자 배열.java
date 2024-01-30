import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        for(int i =0;i<arr.length;i++){
            count += arr[i] % divisor == 0? 1 : 0;
        }
        
        if(count ==0){
            int[] answer = {-1};
            return answer;
         }
        
        int[] answer = new int[count];
        int number =0;
        for(int j =0;j<arr.length;j++){
            if(arr[j] % divisor ==0){
                answer[number] = arr[j];
                number++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}