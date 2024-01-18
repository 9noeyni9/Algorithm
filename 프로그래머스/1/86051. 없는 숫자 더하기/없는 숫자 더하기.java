class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int answer2 = 0;
        int answer3 =0;
        for(int i = 0; i < numbers.length;i++){
            for(int n = 0; n <= 9; n++){
                answer2 += numbers[i] == n? n :0;
            }
        }
        for(int j = 0; j <= 9 ; j++){
            answer3 += j;
        }
        
        answer = answer3 - answer2;
        return answer;
    }
}