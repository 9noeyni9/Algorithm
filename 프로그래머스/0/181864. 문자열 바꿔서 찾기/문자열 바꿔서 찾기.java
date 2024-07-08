class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.replaceAll("A","C");
        myString = myString.replaceAll("B", "A");
        myString = myString.replaceAll("C", "B");
        answer = myString.contains(pat) ? 1 : 0;
        return answer;
    }
}