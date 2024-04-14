class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i =0;i<array.length;i++){
            String str = array[i] + "";
            for(int j =0;j<str.length();j++){
                char chr = str.charAt(j);
                if(chr == '7')
                    answer++;
            }
        }
        return answer;
    }
}