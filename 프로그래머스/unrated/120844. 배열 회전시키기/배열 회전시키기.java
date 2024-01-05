class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if(direction.equals("right")){
            for(int i = 0 ;i<numbers.length-1;i++){
                answer[i+1] = numbers[i];
            }
            answer[0] = numbers[numbers.length-1];
        }else{
            for(int j = 0;j<numbers.length-1;j++){
                answer[j] = numbers[j+1];
            }
            answer[numbers.length-1] = numbers[0];
        }
        return answer;
    }
}