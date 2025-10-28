import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack();
        stack.push(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if(stack.peek() == arr[i]) {
                stack.pop();
            }
            stack.push(arr[i]);
        }
        int[] answer = new int[stack.size()];
        
        for(int j = answer.length-1 ; j >=0; j--) {
            answer[j] = stack.pop();
        }

        return answer;
    }
}