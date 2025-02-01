import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        br.close();
        
        PriorityQueue<String> pq = new PriorityQueue<>();
        
        for(int i = 0; i < str.length(); i++){
            pq.offer(str.substring(i));
        }
        
        while(!pq.isEmpty()){
            bw.write(pq.poll() + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}