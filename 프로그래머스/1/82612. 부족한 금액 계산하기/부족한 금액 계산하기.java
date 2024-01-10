class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long result_price = 0;
        for(int i = 1 ; i<= count;i++){
            result_price += price *i;
        }

        answer = result_price > money? result_price - money:0;
        return answer;
    }
}