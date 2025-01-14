class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int start = myString.length() - pat.length();
        while(true){
            if(myString.substring(start, start + pat.length()).equals(pat)){
                answer = myString.substring(0,start + pat.length());
                break;
            }
            start--;
        }
        return answer;
    }
}