class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int n = 0;
        int count = 0;
        if(s.length() == 4 || s.length() == 6){
            for(int i = 0 ; i < s.length();i++){
            n = s.charAt(i);
            if(n >='0' && n <= '9'){
                count++;
            }
        }
        answer = count == s.length() ? true : false;   
        }else{
            answer = false;
        }
        return count == s.length();
    }
}