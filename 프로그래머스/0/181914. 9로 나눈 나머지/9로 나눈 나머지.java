class Solution {
    public int solution(String number) {
        String[] numbers = number.split("");
        int sum = 0;
        for(int i = 0; i<numbers.length;i++){
            sum += Integer.parseInt(numbers[i]);
        }
        return sum % 9;
    }
}