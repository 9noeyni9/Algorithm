import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int max = 0;
        for(int number : array) {
            map.put(number, map.getOrDefault(number,0) + 1);
            max = Math.max(max, map.get(number));
        }
        
        int count = 0; 
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() == max) {
                count++; 
                answer = entry.getKey();
            }
        }
        return count == 1 ? answer : -1;
    }
}