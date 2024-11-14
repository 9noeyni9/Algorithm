class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < cipher.length(); i++){
            if((i+1) % code == 0){
                answer.append(cipher.substring(i,i+1));
            }
        }
        return answer.toString();
    }
}