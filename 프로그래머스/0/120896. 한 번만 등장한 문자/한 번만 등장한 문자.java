import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] array = s.split("");
        
        TreeMap<String, Integer> map = new TreeMap<>();
        
        for(String key : array){
            map.put(key,map.getOrDefault(key,0)+1);
        }
        answer.append("");
        
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1) {
                answer.append(entry.getKey());
            }
        }
        
        return answer.toString();
    }
}