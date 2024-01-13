class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] str_arr = my_string.split("");
        String[] arr = new String[my_string.length()*n];
        for(int i = 0;i < str_arr.length;i++){
            int num = 0;
            while(num <n){
                arr[i*n + num] = str_arr[i];
                num++;
            }
        }
        answer = String.join("",arr);
        return answer;
    }
}