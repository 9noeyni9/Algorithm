

class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int i = 0;
        int sum = 0;
        for(i=0; i < numbers.length ; i++){
            sum += numbers[i];
        }
        answer = (double)sum / numbers.length;
        return answer;
    }
}