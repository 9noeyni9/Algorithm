class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str_a = a + "";
        String str_b = b + "";
        
        int ab = Integer.parseInt(str_a + str_b);
        int ba = Integer.parseInt(str_b + str_a);
        
        answer = ab > ba ? ab : ba;
        return answer;
    }
}