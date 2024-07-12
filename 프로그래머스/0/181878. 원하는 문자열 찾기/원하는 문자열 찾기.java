class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.toUpperCase();
        pat = pat.toUpperCase();
        for(int i = 0; i <= myString.length() - pat.length();i++){
           answer = myString.contains(pat) ? 1 : 0;    
        }
        return answer;
    }
}