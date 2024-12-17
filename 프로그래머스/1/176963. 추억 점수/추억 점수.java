import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String,Integer> map = new HashMap<>();
        
        for(int i = 0; i < name.length; i++) {
            map.put(name[i],yearning[i]);
        }
        
        for(int j =0; j < photo.length; j++){
            for(int k = 0; k < photo[j].length; k++) {
                answer[j] += map.containsKey(photo[j][k]) ? map.get(photo[j][k]) : 0;
            }
        }
        return answer;
    }
}