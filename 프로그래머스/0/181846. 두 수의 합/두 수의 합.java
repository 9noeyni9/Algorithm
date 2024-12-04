import java.math.*;

class Solution {
    public String solution(String a, String b) {
        BigInteger numberA = new BigInteger(a);
        BigInteger numberB = new BigInteger(b);
        
        String answer = String.valueOf(numberA.add(numberB));
        return answer;
    }
}