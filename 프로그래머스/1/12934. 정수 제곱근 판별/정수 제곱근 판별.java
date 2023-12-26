class Solution {
    public long solution(long n) {
        long answer = 0;
        long x =0;
        for(x=1;x<=n;x++){
            if(x*x == n){
                answer = (x+1)*(x+1);   
                break;
            }
            else
                answer = -1;
        }
        return answer;
    }
}