class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[my_str.length() % n != 0 ? my_str.length() / n +1 : my_str.length() / n];
        for(int i = 0; i < answer.length -1; i++){
            answer[i] = my_str.substring(n*i, n*i +n);
        }
        answer[answer.length-1] = my_str.substring(n*(answer.length -1),my_str.length());
        return answer;
    }
}