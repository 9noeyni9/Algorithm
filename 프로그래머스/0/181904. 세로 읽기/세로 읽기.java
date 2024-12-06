class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < my_string.length() / m; i++){
            answer.append((char)my_string.charAt((c-1) + m *i));
        }
        return answer.toString();
    }
}