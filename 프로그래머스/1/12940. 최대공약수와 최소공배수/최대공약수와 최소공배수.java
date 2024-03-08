class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcdResult = gcd(Math.max(m,n),Math.min(m,n));
        answer[0] = gcdResult;
        answer[1] = m*n/gcdResult;
        return answer;
    }
    
    public int gcd(int m, int n){
        if(m%n == 0) return n;
        return gcd(n, m%n);
    }
}