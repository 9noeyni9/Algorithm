import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        HashSet<Integer> set = new HashSet<>();
        
        int size = Integer.parseInt(br.readLine());
        int answer = Integer.parseInt(br.readLine());
        
        String[] array = br.readLine().split(" ");
        
        br.close();
        
        for(int i = 0; i < array.length; i++){
            set.add(Integer.parseInt(array[i]));
        }
        
        int count = 0;
        for(int j = 0; j < array.length; j++){
            int number = Integer.parseInt(array[j]);
            set.remove(number);
            if(set.contains(answer - number)){
                set.remove(answer - number);
                count++;
            }
        }
        
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}