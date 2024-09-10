import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        HashMap<String,String> map = new HashMap<>();
        
        String[] array = br.readLine().split(" ");
        int N = Integer.parseInt(array[0]);
        int M = Integer.parseInt(array[1]);
        
        for(int i = 0; i < N; i++){
            array = br.readLine().split(" "); 
            map.put(array[0],array[1]);
        }
        
        for(int j = 0; j < M; j++){
            bw.write(map.get(br.readLine()) + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}