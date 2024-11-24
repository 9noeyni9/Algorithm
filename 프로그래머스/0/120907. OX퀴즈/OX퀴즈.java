class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i < quiz.length; i++){
            String[] array = quiz[i].split(" ");
            int number = array[1].equals("+") ?  Integer.parseInt(array[0]) + Integer.parseInt(array[2]) : Integer.parseInt(array[0]) - Integer.parseInt(array[2]);
            answer[i] = Integer.parseInt(array[4]) == number ? "O" : "X";
        }
        return answer;
    }
}