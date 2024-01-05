import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0 ;i < numlist.length;i++){
            if(numlist[i] % n == 0)
                arr.add(numlist[i]);
        }
        int[] answer = new int[arr.size()];
        for(int j =0 ;j < arr.size();j++)
            answer[j] = arr.get(j);
        return answer;
    }
}