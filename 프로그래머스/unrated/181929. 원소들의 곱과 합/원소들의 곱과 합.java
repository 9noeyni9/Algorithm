class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int product = 1;
        for(int i = 0;i < num_list.length;i++){
            sum += num_list[i];
            product *= num_list[i];
        }
        return sum*sum > product ? 1 : 0;
    }
}