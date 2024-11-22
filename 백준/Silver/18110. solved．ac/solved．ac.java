import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int size = Integer.parseInt(br.readLine());
        int[] numbers = new int[size];
        int excludedNumber = (int)Math.round(size * (double)15/100);
        
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        
        Arrays.sort(numbers);
        
        int sum = 0;
        int count = 0;
        for(int j = excludedNumber; j < numbers.length - excludedNumber; j++){
            sum += numbers[j];
            count++;
        }
        int avg = (int)Math.round((double)sum / count); 
        
        bw.write(avg + "\n");
        bw.flush();
        bw.close();
    }
}