import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] arr = Long.toString(n).split("");
        Arrays.sort(arr,Collections.reverseOrder());
        String str = String.join("",arr);
        
        answer = Long.parseLong(str);
        return answer;
    }
}