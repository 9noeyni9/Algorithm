class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int i = 0;
        int sum = 0;
        for(i=0;i<arr.length;i++)
            sum += arr[i];
        answer = (double)sum / arr.length;
        return answer;
    }
}