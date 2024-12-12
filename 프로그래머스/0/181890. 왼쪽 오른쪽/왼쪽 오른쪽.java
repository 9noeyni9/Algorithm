import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        
        ArrayList<String> list = new ArrayList<>();
        int count = 0;
        
        for(int i = 0; i < str_list.length; i++) {
            if(count == 0) {
                if(str_list[i].equals("l")){
                    count++;
                    break;
                } else if(str_list[i].equals("r")){
                    count++;
                    list = new ArrayList<String>();
                    continue;
                }
            }
            list.add(str_list[i]);            
        }
        
        if(list.size() != str_list.length){
            answer = list.toArray(new String[0]);
        }
        return answer;
    }
}