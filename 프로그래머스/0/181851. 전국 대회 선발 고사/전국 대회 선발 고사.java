import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        
        PriorityQueue<Record> pq = new PriorityQueue<>((record1,record2) -> {
            return Integer.compare(record1.rank, record2.rank);
        });
        for(int i = 0; i < rank.length; i++){
            if(attendance[i] == false){
                continue;
            }
            pq.offer(new Record(i,rank[i]));
        }
        
        int num = 10000;
        for(int j = 0; j < 3; j++){
            Record record = pq.poll();
            answer += record.id * num;
            num /= 100;
        }
        return answer;
    }
}

class Record {
    int id;
    int rank;
    boolean attendance;
    
    public Record(int id, int rank){
        this.id = id;
        this.rank = rank;
    }
}