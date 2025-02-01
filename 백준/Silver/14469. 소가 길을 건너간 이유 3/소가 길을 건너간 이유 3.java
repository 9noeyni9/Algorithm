import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int count = Integer.parseInt(br.readLine());
        PriorityQueue<Cow> pq = new PriorityQueue<>((cow1, cow2) -> {
            return Integer.compare(cow1.arrivalTime, cow2.arrivalTime);
        });
        
        for(int i = 0; i < count; i++){
            String[] array = br.readLine().split(" ");
            pq.offer(new Cow(Integer.parseInt(array[0]), Integer.parseInt(array[1])));
        }
        
        int totalTime = 0;
        while(!pq.isEmpty()){
            Cow cow = pq.poll();
            if(totalTime > cow.arrivalTime){
                totalTime = totalTime + cow.time;
            }else{
                totalTime = cow.arrivalTime + cow.time;
            }
        }
        bw.write(totalTime + "\n");
        bw.flush();
        bw.close();
    }
}

class Cow {
    int arrivalTime;
    int time;
    
    public Cow(int arrivalTime, int time){
        this.arrivalTime = arrivalTime;
        this.time = time;
    }
}