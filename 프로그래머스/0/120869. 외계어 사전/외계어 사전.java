import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        Arrays.sort(spell);
        
        for(int i = 0; i < dic.length; i++){
            if(dic[i].length() != spell.length) {
                continue;
            }
            String[] array = dic[i].split("");
            Arrays.sort(array);
            if(Arrays.equals(spell, array)){
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}