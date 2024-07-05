class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        if(k % 2 == 1){
            for(int i = 0; i < arr.length; i++){
                answer[i] = k* arr[i];
            }
        } else {
            for(int j = 0; j < arr.length; j++){
                answer[j] =  k + arr[j];
            }
        }
        return answer;
    }
}