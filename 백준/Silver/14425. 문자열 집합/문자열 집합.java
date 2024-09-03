import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<String> set = new HashSet<>();
        
        String[] array = br.readLine().split(" ");
        int N = Integer.parseInt(array[0]);
        int M = Integer.parseInt(array[1]);
        
        for(int i = 0; i < N; i++) {
            set.add(br.readLine());
        }
        
        int count = 0;
        for(int j = 0; j < M; j++){
            count += set.contains(br.readLine()) ? 1 : 0;
        }
        
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}