import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i++){
            char chr = (char)my_string.charAt(i);
            if(chr == ' '){
                if(!sb.toString().equals("")){
                    list.add(sb.toString());
                    sb = new StringBuilder();
                }else {
                    continue;
                }
            }else {
                sb.append(chr);
            }
        }
        
        if(!sb.toString().equals("")){
            list.add(sb.toString());
        }
        String[] answer = new String[list.size()];
        
        for(int j = 0; j < answer.length; j++){
            answer[j] = list.get(j);
        }
        return answer;
    }
}