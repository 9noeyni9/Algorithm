class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        for(int i = 0; i < A.length(); i++){
            if(A.equals(B)){
                break;
            }
            A = confirmString(A);
            answer++;
        }
        
        if(answer == A.length()){
            answer = -1;
        }
        return answer;
    }
    
    public String confirmString(String A) {
        StringBuilder sb = new StringBuilder();
        sb.append((char)A.charAt(A.length()-1));
        sb.append(A.substring(0, A.length()-1));
        
        return sb.toString();
    }
}