class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder();
        if(s != 0) {
            answer.append(my_string.substring(0, s));
        }
        for(int i = e; i >= s; i--){
            answer.append(my_string.substring(i,i+1));
        }
        if(e != my_string.length()-1){
            answer.append(my_string.substring(e+1,my_string.length()));
        }
        return answer.toString();
    }
}