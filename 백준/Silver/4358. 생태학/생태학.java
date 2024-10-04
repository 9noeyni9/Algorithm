import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        TreeMap<String, Integer> map = new TreeMap<>();
        
        String  str = "";
        int total = 0;
        while ((str = br.readLine()) != null) {
            total++;
            if(map.containsKey(str)){
                map.put(str, map.get(str)+1);
            }else{
                map.put(str,1);
            }
        }
        
        br.close();
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
                bw.write(entry.getKey() + " " + String.format("%.4f", (double)entry.getValue()/total*100)+"\n");
            }
        
        bw.flush();
        bw.close();

    }
}