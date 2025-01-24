import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> prQueue = new PriorityQueue<>();
        
        for(int i = 0; i < scoville.length; i++){
            prQueue.offer(scoville[i]);
        }
        
        while(prQueue.size() > 1){
            if(prQueue.peek() >= K){
                break;
            }
            prQueue.offer(prQueue.poll() + prQueue.poll()*2);
            answer++;
        }
        
        if(prQueue.peek() < K){
            answer = -1;
        }
        return answer;
    }
}