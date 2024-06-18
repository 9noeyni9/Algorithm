class Solution {
    public int solution(int num, int k) {
        String[] array = String.valueOf(num).split("");
        for(int i = 0; i < array.length; i++){
            if(Integer.parseInt(array[i]) == k){
                return i+1;
            }
        }
        return -1;
    }
}