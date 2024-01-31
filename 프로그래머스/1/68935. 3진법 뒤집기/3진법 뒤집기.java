class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n,3);
        
        StringBuffer sb = new StringBuffer(str);
        
        str = sb.reverse().toString();
        
        
        answer = Integer.parseInt(str,3);
        
        return answer;
    }
}