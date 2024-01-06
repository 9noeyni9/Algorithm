class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] arr_order = (Integer.toString(order)).split("");
        for(int i = 0; i< arr_order.length;i++){
            if(arr_order[i].equals("3") || arr_order[i].equals("6") || arr_order[i].equals("9")){
             answer += 1;   
            }
        }
        return answer;
    }
}