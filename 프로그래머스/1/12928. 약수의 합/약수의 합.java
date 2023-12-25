class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 0;
        if(n >=0 && n <= 3000){
            for(i = 1 ; i <= n ;i++){
                if(n%i == 0)
                    answer += i;
            }            
        }
        return answer;
    }
}