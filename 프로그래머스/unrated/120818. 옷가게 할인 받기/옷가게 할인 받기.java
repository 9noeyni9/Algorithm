class Solution {
    public int solution(int price) {
        double answer_double = 0;
        int answer = 0;
        if(price >= 500000)
            answer_double = (double)price * 0.8;
        else if(price >= 300000)
            answer_double = (double)price * 0.9;
        else if(price >= 100000)
            answer_double = (double)price * 0.95;
        else
            answer_double = (double)price;
        answer = (int)(answer_double);
        return answer;
    }
}