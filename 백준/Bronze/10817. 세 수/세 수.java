import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] array = br.readLine().split(" ");
        int[] numbers = new int[array.length];
        for(int i = 0; i < numbers.length;i++){
            numbers[i] = Integer.parseInt(array[i]);
        }
        
        Arrays.sort(numbers);
        
        bw.write(numbers[1] + "\n");
        bw.flush();
        bw.close();
    }
}