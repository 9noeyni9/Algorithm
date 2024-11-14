import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        int numberA = numbers[0] * numbers[1];
        int numberB = numbers[numbers.length-1] * numbers[numbers.length-2];
        return numberA > numberB ? numberA : numberB;
    }
}