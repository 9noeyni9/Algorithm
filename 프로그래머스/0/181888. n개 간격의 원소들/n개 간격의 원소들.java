class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        answer = num_list.length % n == 0 ? new int[num_list.length/n] : new int[num_list.length/n +1];
        answer[0] = num_list[0];
        for(int i = 1; i < answer.length; i++){
            answer[i] = num_list[n*i];
        }
        return answer;
    }
}