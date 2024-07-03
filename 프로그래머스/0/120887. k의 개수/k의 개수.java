class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int num = i; num <= j; num++){
            String[] array = String.valueOf(num).split("");
            for(int a = 0; a < array.length; a++){
                answer += array[a].equals(String.valueOf(k)) ? 1 : 0;
            }
        }
        return answer;
    }
}