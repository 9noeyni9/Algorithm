import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        PriorityQueue<Integer> prQueue = new PriorityQueue<>(Collections.reverseOrder());
        
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < N; i++){
            String[] array = br.readLine().split(" ");
            for(int j = 0; j < N; j++){
                prQueue.offer(Integer.parseInt(array[j]));
            }
        }
        
        for(int k = 0; k < N-1; k++){
            prQueue.poll();
        }
        
        bw.write(prQueue.poll()+"\n");
        bw.flush();
        bw.close();
    }
}