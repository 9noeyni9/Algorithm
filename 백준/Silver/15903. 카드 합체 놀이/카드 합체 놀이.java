import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Long> pq = new PriorityQueue<>();
        
        String[] counts = br.readLine().split(" ");
        int N = Integer.parseInt(counts[0]);
        int M = Integer.parseInt(counts[1]);
        
        String[] array = br.readLine().split(" ");
        br.close();
        
        for(int j = 0; j < N; j++){
            pq.offer(Long.parseLong(array[j]));
        }
        
        for(int i = 0; i < M; i++){
            long input = pq.poll();
            input += pq.poll();
            
            pq.offer(input);
            pq.offer(input);
        }
        
        long answer = 0;
        while(!pq.isEmpty()){
            answer += pq.poll();
        }
        
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}