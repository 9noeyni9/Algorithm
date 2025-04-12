import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer, Integer> countInt = new HashMap<>();
        
        for(String operation: operations) {
            if(operation.equals("D 1")) {
                clean(maxHeap, countInt);  
                if(!maxHeap.isEmpty()) {
                    int maxKey = maxHeap.poll();
                    countInt.put(maxKey, countInt.get(maxKey) -1);
                }
            }else if(operation.equals("D -1")){
                clean(minHeap, countInt);  
                if(!minHeap.isEmpty()) {
                    int minKey = minHeap.poll();
                    countInt.put(minKey, countInt.get(minKey)-1);
                }
            }else {
                String[] input = operation.split(" ");
                int number = Integer.parseInt(input[1]);
                minHeap.offer(number);
                maxHeap.offer(number);
                countInt.put(number, countInt.getOrDefault(number, 0) + 1);
            }
        }
        clean(maxHeap, countInt);
        clean(minHeap, countInt);
        
        if(!maxHeap.isEmpty()){
            answer[0]= maxHeap.poll();
            answer[1] = minHeap.poll();
        }
        
        return answer;
    }
    
    static void clean(PriorityQueue<Integer> heap, HashMap<Integer, Integer> map) {
        while(!heap.isEmpty()){
            int checkKey = heap.peek();
            if(map.get(checkKey) == 0){
                heap.poll();
            }else{
                break;
            }
        }
    }
}