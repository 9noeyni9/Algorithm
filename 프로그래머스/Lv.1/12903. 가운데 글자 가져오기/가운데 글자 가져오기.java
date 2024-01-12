class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length() % 2 ==1){
            answer=s.substring((1+s.length())/2-1,(1+s.length())/2);
        }else{
            answer = s.substring(s.length()/2-1,s.length()/2+1);
        }
        return answer;
    }
}