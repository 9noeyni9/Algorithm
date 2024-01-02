import java.util.*;

class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] arr = rsp.split("");
        String[] win = new String[arr.length];
        for(int i = 0 ;i < arr.length; i++){
            win[i] = arr[i].equals("2")? "0": (arr[i].equals("0")? "5":"2");
            
        }
        answer = String.join("",win);
        return answer;
    }
}