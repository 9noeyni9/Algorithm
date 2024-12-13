import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int count = Integer.parseInt(br.readLine());
        
        String[] array = br.readLine().split(" ");
        
        br.close();
        
        int[] numbers = new int[count];
        
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(array[i]);
        }
        
        Arrays.sort(numbers);
        
        for(int j = 0; j < numbers.length; j++){
            bw.write(numbers[j] + " ");
        }
        
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}