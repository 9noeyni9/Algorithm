class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcd_result = gcd(Math.max(m,n),Math.min(m,n));
        answer[0] = gcd_result;
        answer[1] = m*n/gcd_result;
        return answer;
    }
    
    public int gcd(int m, int n){
        if(m%n == 0) return n;
        return gcd(n,m%n);
    }
}