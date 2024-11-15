import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 97; i <= 122; i++) {
            map.put((char)i , 0);
        }
        
        String input = br.readLine();
        
        br.close();
        
        for(int j = 0; j < input.length(); j++){
            char chr = (char)input.charAt(j);
            int count = map.get(chr);
            map.put(chr, count+1);
        }
        
        for(int k = 97; k <= 122; k++){
            sb.append(map.get((char)k) + " ");
        }
        
        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
    }
}