class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String strToA = a +"";
        String aPlusB = strToA + b;
        int strToNum = Integer.parseInt(aPlusB);
        int doubleNum = 2*a*b;
        answer = strToNum < doubleNum ? doubleNum : strToNum;
        return answer;
    }
}