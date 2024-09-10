import java.io.*;
import java.util.*;

public class Main{ 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<String> set = new HashSet<>();
        
        int count = Integer.parseInt(br.readLine());
        set.add("ChongChong");
        for(int i = 0; i < count; i++){
            String[] array = br.readLine().split(" ");
            if(set.contains(array[0]) || set.contains(array[1])){
                set.add(array[0]);
                set.add(array[1]);
            }
        }
        
        bw.write(set.size() + "\n");
        bw.flush();
        bw.close();
    }
}