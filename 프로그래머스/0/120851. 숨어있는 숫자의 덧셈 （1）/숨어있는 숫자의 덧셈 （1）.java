class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        String[] arr = my_string.split("");
        for(int i = 0; i<arr.length;i++){
            int number = 0;
            number = Integer.parseInt(arr[i]);
            answer+=number;
        }
        return answer;
    }
}