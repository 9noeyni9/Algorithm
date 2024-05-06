class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] calculate = binomial.split(" ");
        answer = calculate[1].equals("+") ? Integer.parseInt(calculate[0]) + Integer.parseInt(calculate[2]) : calculate[1].equals("-") ? Integer.parseInt(calculate[0]) - Integer.parseInt(calculate[2]) : Integer.parseInt(calculate[0]) * Integer.parseInt(calculate[2]);
        return answer;
    }
}