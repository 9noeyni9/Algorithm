import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int count = Integer.parseInt(br.readLine());
        String[] array = br.readLine().split(" ");
        int[] numbers = new int[array.length];

        for(int i = 0; i < array.length; i++){
            numbers[i] = Integer.parseInt(array[i]);
        }
        
        Arrays.sort(numbers);
        
        int totalTime = 0;
        for(int j = 0; j < numbers.length; j++){
            totalTime += (count-j)*numbers[j];
        }
        
        bw.write(totalTime + "\n");
        bw.flush();
        bw.close();
    }
}