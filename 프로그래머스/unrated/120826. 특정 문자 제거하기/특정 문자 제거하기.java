class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String[] arr = my_string.split(letter);
        for(int i = 0 ;i < arr.length;i++ ){
            answer += arr[i];
        }
        return answer;
    }
}