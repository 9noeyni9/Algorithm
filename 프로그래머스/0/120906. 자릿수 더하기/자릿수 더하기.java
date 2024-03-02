class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = n + "";
        String[] arr = str.split("");
        for(int i = 0;i < arr.length;i++){
            answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }
}