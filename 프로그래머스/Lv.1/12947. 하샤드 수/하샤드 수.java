class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int staticx = x;
        int h = 0;
        while(x>0){
            h += x%10;
            if(x < 10){break;}
            x/=10;
        }
        answer = (staticx % h == 0? true:false);
        return answer;
    }
}