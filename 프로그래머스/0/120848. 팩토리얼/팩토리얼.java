class Solution {
    public int solution(int n) {
        int answer = 0;
        int number = 1;
        while(true) {
            if(n < number){
                answer--;
                break;
            }  
            answer++;
            number *= answer;
        }
        return answer;
    }
}