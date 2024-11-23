class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++){
            int charNum = my_string.charAt(i);
            if(!(charNum >= 65 && charNum <= 122)) {
                str.append((char)charNum);
            } else {
                if(!str.toString().equals("")) {
                    answer += Integer.parseInt(str.toString());
                    str = new StringBuilder();
                }
            }
        }
        
        if(!str.toString().equals("")) {
            answer += Integer.parseInt(str.toString());
            str = new StringBuilder();
        }
        return answer;
    }
}