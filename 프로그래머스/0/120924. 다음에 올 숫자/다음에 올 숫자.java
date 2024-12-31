class Solution {
    public int solution(int[] common) {
        int answer = 0;
        if((double)common[1] == (common[0]+common[2])/(double)2){
            answer = common[0] + common.length*(common[1]-common[0]);
        }else {
            answer = common[1]/common[0] * common[common.length-1];
        }
        return answer;
    }
}