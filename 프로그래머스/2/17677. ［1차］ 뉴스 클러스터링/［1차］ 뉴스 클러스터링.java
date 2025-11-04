import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < str1.length()-1; i++) {
            String key = str1.substring(i, i+2);
            key = key.replaceAll("[^A-Z]", "");
            if(key.length() != 2) continue;
            map.put(key, map.getOrDefault(key,0) +1);
        }
        
        int intersection = 0;
        int union = map.values().stream().mapToInt(Integer::intValue).sum();
        for(int j = 0; j < str2.length()-1; j++) {
            String key = str2.substring(j, j+2);
            key = key.replaceAll("[^A-Z]", "");
            if(key.length() != 2) continue;
            if (map.containsKey(key) && map.get(key) > 0) {
                intersection++;
                map.put(key, map.get(key) - 1);
            } else {
                union++;
            }
        }
        if (union == 0) return 65536;
        return (int)((double)intersection / union * 65536);
    }
}