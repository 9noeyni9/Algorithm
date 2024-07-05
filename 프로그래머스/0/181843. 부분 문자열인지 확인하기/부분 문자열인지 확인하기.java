class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        answer = my_string.contains(target) ? 1 : 0;
        return answer;
    }
}