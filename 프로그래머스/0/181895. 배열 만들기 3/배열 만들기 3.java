class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int size = (intervals[0][1]-intervals[0][0]+1) + (intervals[1][1] - intervals[1][0]+1);
        int[] answer = new int[size];
        int k = 0;
        for(int i = intervals[0][0]; i <= intervals[0][1]; i++){
            answer[k] = arr[i];
            k++;
        }
        
        for(int j = intervals[1][0]; j <= intervals[1][1]; j++){
            answer[k] = arr[j];
            k++;
        }
        return answer;
    }
}