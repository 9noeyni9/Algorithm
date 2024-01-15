class Solution {
    public int[] solution(int[] arr) {
        int index =0;
        if(arr.length != 1){
            int[] answer = new int[arr.length -1];
            int min =arr[0];
            for(int i =0;i<arr.length;i++){
                if(min > arr[i])
                    min = arr[i];
            }
            for(int j =0;j<arr.length;j++){
                if(arr[j] == min)
                    continue;
                answer[index++] = arr[j];
            }
            return answer;
        }else{
            int[] answer = {-1};
            return answer;
        }
    }
}