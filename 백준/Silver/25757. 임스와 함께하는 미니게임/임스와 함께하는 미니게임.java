import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] array = br.readLine().split(" ");
        int count = Integer.parseInt(array[0]);
        
        HashSet<String> set = new HashSet<>();
        
        for(int i = 0; i < count; i++){
            set.add(br.readLine());
        }
        
        br.close();
        
        int result = 0;
        if(array[1].equals("Y")){
            result = set.size();
        }else if(array[1].equals("F")){
            result = set.size()/2;
        }else {
            result = set.size()/3;
        }
        
        bw.write(result +"\n");
        bw.flush();
        bw.close();
    }
}