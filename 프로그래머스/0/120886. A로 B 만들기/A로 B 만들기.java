import java.util.*;

class Solution {
    public int solution(String before, String after) {
        String[] beforeArray = before.split("");
        String[] afterArray = after.split("");
        
        Arrays.sort(beforeArray);
        Arrays.sort(afterArray);
        return Arrays.equals(beforeArray, afterArray) ? 1: 0;
    }
}