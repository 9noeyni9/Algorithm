import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < answer.length;i++){
            if(!answer[i].equals("")){
                list.add(answer[i]);
            }
        }
        Collections.sort(list);
        String[] array = new String[list.size()];
        list.toArray(array);
        return array;
    }
}