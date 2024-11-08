class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        char[] chrArray = new char[(age+"").length()];
        for(int i = 0; i < chrArray.length; i++){
            chrArray[i] = (age+"").charAt(i);
            answer.append(String.valueOf((char)(chrArray[i]+'1')));
        }
        return answer.toString();
    }
}