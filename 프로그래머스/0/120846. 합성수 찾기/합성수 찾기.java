class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 3; i <= n; i++){
            for(int j = 2; j <= (int)Math.sqrt(i); j++){
                if(i % j == 0){
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}