import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        TreeMap<String, Integer> map = new TreeMap<>();
        
        int count = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < count; i++){
            String[] array = br.readLine().split("\\.");
            int number = 0;
            number = map.containsKey(array[1]) ? map.get(array[1]) + 1 : 1;
            map.put(array[1], number);
        }
        
        br.close();
        
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            bw.write(entry.getKey() + " " + entry.getValue()+"\n");
        }
        
        bw.flush();
        bw.close();
    }
}