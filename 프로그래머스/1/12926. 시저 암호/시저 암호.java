class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                answer+=' ';
                continue;
            }
            if(ch >= 'a' && ch <= 'z'){
                answer += ch +n >'z'? (char)(ch-26+n) : (char)(ch+n);
            }else{
                answer += ch +n >'Z'? (char)(ch-26+n) : (char)(ch+n);
            }
        }
        return answer;
    }
}