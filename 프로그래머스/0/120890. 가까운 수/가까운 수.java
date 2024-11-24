class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int difference = Math.abs(n - array[0]);
        for(int i = 1;i < array.length; i++){
            int number = Math.abs(n - array[i]);
            if(number < difference){
                difference = number;
                answer = array[i];
            }
            
            if(number == difference) {
                answer = answer <= array[i] ? answer : array[i];
            }
        }
        return answer;
    }
}