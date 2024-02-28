class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] numbers = {"0","1","2","3","4","5","6","7","8","9"};
        String[] replaceWord = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i = 0;i < numbers.length;i++){
            s =s.replace(replaceWord[i],numbers[i]);
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}