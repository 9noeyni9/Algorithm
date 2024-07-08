class Solution {
    public String[] solution(String[] strArr) {
        int j = 0;
        for(int i = 0; i < strArr.length ; i++){
            if(!strArr[i].contains("ad")) {
                j++;
            }
        }
        
        String[] answer = new String[j];
        int a = 0;
        for(int k = 0; k < strArr.length;k++){
            if(!strArr[k].contains("ad")) {
                answer[a] = strArr[k];
                a++;
            }
        }
        return answer;
    }
}