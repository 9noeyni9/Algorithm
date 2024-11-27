class Solution {
    public long solution(String numbers) {
        String[] array = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < array.length; i++){
            numbers = numbers.replace(array[i], String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }
}