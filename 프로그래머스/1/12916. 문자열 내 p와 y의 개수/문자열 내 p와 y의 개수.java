class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int length = s.length();
        
        s = s.toUpperCase();
        int pCount = s.replace("P","").length();
        int yCount = s.replace("Y","").length();
        
        answer = (length - pCount) == (length - yCount) ? true : false;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}