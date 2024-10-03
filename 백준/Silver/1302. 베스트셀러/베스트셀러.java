import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        TreeMap<String, Integer> map = new TreeMap<>();
        
        int count = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < count; i++){
            String input = br.readLine();
            if(map.containsKey(input)){
                int beforeNumber = map.get(input);
                map.put(input, beforeNumber+1);
            }else{
                map.put(input,0);
            }
        }
        br.close();
        
        int maxCount = Collections.max(map.values());
        String result = "";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxCount) {
                result = entry.getKey(); 
                break; 
            }
        }
        
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}