import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = n + "";
        String[] arr = str.split("");
        Arrays.sort(arr,Collections.reverseOrder());
        answer = Long.parseLong(String.join("",arr));
        return answer;
    }
}