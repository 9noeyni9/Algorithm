import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char chr = s.charAt(i);
            if(chr == '('){
                stack.push(chr);
            } else {
                if(stack.empty() == true){
                    answer = false;
                    return answer;
                } else {
                    stack.pop();
                }
            }
        }

        if(stack.empty() == true){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}