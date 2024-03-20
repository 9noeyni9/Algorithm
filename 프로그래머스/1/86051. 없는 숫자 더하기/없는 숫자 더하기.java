class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int matchedSum = 0;
        int totalSum =0;
        for(int i = 0; i < numbers.length;i++){
            for(int n = 0; n <= 9; n++){
                matchedSum += numbers[i] == n? n :0;
            }
        }
        for(int j = 0; j <= 9 ; j++){
            totalSum += j;
        }
        
        answer = totalSum - matchedSum;
        return answer;
    }
}