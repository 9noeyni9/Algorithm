import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < reserve.length; i++){
            map.put(reserve[i], 2);
        }
        
        for(int j = 0; j < lost.length; j++){
            int value = map.containsKey(lost[j]) ? map.get(lost[j]) - 1 : 0;
            map.put(lost[j], value);
        }
        for(int k = 1; k <= n; k++){
            if(!map.containsKey(k)){
                map.put(k,1);
            }
            
            if(map.get(k) == 0){
                if(map.getOrDefault(k-1,0) == 2){
                    map.put(k,1);
                    map.put(k-1,1);
                } else if(map.getOrDefault(k+1,0)==2){
                    map.put(k,1);
                    map.put(k+1,1);
                }
            }
        }
        
        for(int value : map.values()){
            if(value >= 1){
                answer++;
            }
        }
                    
        return answer;
    }
}