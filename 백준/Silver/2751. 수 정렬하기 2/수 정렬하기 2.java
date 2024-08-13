import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int calcNum = Integer.parseInt(br.readLine());
        int[] numbers = new int[calcNum];
        for(int i = 0; i < calcNum; i++){
            int number = Integer.parseInt(br.readLine());
            numbers[i] = number;
        }
        
        Arrays.sort(numbers);
        
        for(int j = 0; j < numbers.length; j++){
            bw.write(numbers[j] + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}