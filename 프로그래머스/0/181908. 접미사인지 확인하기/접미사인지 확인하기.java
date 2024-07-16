class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        if(my_string.length() < is_suffix.length()){
            answer = 0;
        }else{
            answer = my_string.substring(my_string.length() - is_suffix.length()).equals(is_suffix) ? 1 : 0;
        }
        return answer;
    }
}