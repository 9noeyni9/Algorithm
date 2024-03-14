class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] arr = (x+"").split("");
        int[] arrNum = new int[arr.length];
        int h = 0;
        for(int i =0;i<arr.length;i++){
            arrNum[i] = Integer.parseInt(arr[i]);
            h += arrNum[i];
        }
        answer = x % h == 0 ? true : false;
        return answer;
    }
}