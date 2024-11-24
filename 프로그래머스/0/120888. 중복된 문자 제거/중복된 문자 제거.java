import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < my_string.length(); i++){
            char chr = (char)my_string.charAt(i);
            if(!set.contains(chr)) {
                answer.append(chr);
            }            
            set.add(chr);
        }
        return answer.toString();
    }
}