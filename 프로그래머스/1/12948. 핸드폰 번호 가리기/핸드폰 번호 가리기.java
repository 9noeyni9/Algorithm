class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] str = phone_number.split("");
        for(int i = 0; i<str.length; i++){
            str[i] = (i < str.length-4 ? "*" : str[i]);
        }
        answer = String.join("",str);
        return answer;
    }
}