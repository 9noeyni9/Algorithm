import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        TreeSet<Integer> set = new TreeSet<>();
        
        int count = Integer.parseInt(br.readLine());
        
        String[] array = br.readLine().split(" ");
        
        br.close();
        
        for(int i = 0; i < array.length; i++){
            set.add(Integer.parseInt(array[i]));
        }
        
        Integer[] numbers = set.toArray(new Integer[0]);
        
        for(int j = 0; j < numbers.length; j++){
            sb.append(numbers[j] + " ");
        }
        
        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
    }
}