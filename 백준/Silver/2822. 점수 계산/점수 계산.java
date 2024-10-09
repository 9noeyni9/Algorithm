import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        int sum = 0;
        for(int i = 0; i < 8; i++){
            int input = Integer.parseInt(br.readLine());
            map.put(input, i+1);
            sum += input;
        }
        
        br.close();
        
        for(int j = 0; j < 3; j++){
            sum -= map.firstKey();
            map.remove(map.firstKey());
        }
        bw.write(sum + "\n");
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        
        Collections.sort(list);
        
        for(int k = 0; k < list.size(); k++){
            bw.write(list.get(k)+" ");
        }
        
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}