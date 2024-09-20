import java.math.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int number = (int)Math.sqrt(n);
        answer = number * number == n ? 1 : 2;
        return answer;
    }
}