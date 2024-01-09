class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 0;
        int b = 0;
        if(n % 2 == 1){
            for(int i =1;i<=n;i++){
                a= (i%2==1? i:0);
                answer += a;
            }
        }else{
            for(int i = 1;i<=n;i++){
                b = (i%2==0? i*i:0);
                answer += b;
            }
        }
        return answer;
    }
}