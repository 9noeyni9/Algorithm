import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        PriorityQueue<Number> pq = new PriorityQueue<>((number1, number2) -> {
            if(number1.distance != number2.distance) return Integer.compare(number1.distance, number2.distance);
            return Integer.compare(number2.number, number1.number);
        });
        
        for(int i = 0; i < numlist.length; i++) {
            int distance = numlist[i] - n < 0 ? -1 * (numlist[i] - n) : (numlist[i] - n);
            pq.offer(new Number(numlist[i], distance));
        }
        
        for(int j = 0; j < answer.length; j++) {
            Number number = pq.poll();
            answer[j] = number.number;
        }
        return answer;
    }
}

class Number {
    int number;
    int distance;
    
    public Number(int number, int distance) {
        this.number = number;
        this.distance = distance;
    }
}