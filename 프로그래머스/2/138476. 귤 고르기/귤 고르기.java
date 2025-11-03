import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < tangerine.length; i++) {
            map.put(tangerine[i],map.getOrDefault(tangerine[i],0) +1);
        }
        
        List<Integer> valueList = new ArrayList<>(map.values());
        valueList.sort(Integer::compareTo);
        
        for(int j = valueList.size() -1 ; j >= 0; j--) {
            k -= valueList.get(j);
            answer++;
            if(k <= 0) {
                break;
            } 
        }
        return answer;
    }
}