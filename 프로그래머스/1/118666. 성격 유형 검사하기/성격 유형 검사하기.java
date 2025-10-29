import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < survey.length; i++) {
            String[] array = survey[i].split("");
            if(choices[i] < 4) {
                map.put(array[0], map.getOrDefault(array[0],0) + 4 - choices[i]);
            } else {
                map.put(array[1], map.getOrDefault(array[1], 0) + choices[i] - 4);
            }
        }
        
        String[] array2 = {"RT", "CF", "JM", "AN"};
        for(int j = 0; j < 4; j++) {
            String[] array3 = array2[j].split("");
            answer.append(compare(map, array3[0], array3[1]));
        }
        return answer.toString();
    }
    
    public String compare(HashMap<String, Integer> map, String str1, String str2) {
        if(map.getOrDefault(str1,0) < map.getOrDefault(str2, 0)) {
            return str2;
        } else if(map.getOrDefault(str1,0) > map.getOrDefault(str2, 0)) {
            return str1;
        } else {
            return str1.compareTo(str2) < 0 ? str1 : str2;
        }
    }
}