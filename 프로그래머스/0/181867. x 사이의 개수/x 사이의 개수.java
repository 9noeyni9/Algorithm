class Solution {
    public int[] solution(String myString) {
        String[] array = myString.split("x",myString.length());
        int[] answer = new int[array.length];
        for(int i=0;i < array.length;i++){
            answer[i] = array[i].length();
        }
        return answer;
    }
}