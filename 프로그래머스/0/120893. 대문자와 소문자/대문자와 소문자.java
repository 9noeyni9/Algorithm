class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++){
            char chr = my_string.charAt(i) >= 97 ? (char)(my_string.charAt(i) - 32) : (char)(my_string.charAt(i) + 32);
            answer.append(chr);
        }
        return answer.toString();
    }
}