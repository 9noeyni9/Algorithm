import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        HashMap<String, Integer> map = new HashMap<>();
        
        String[] input = br.readLine().toUpperCase().split("");
        
        br.close();
        
        for(int i = 0; i < input.length; i++){
            int number = map.containsKey(input[i]) ? map.get(input[i]) : 0;
            map.put(input[i], number +1);
        }
        
        int maxValue = Collections.max(map.values());
        
        List<String> list = new ArrayList<>();
        
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue().equals(maxValue)){
                list.add(entry.getKey());
            }
        }
        
        if(list.size() != 1){
            bw.write("?" + "\n");
        }else{
            bw.write(list.get(0) + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}