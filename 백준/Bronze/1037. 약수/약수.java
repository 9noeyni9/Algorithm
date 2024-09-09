import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int count = Integer.parseInt(br.readLine());
        String[] array = br.readLine().split(" ");
        int[] numbers = new int[count];
        
        for(int i = 0; i < array.length; i++){
            numbers[i] = Integer.parseInt(array[i]);            
        }
        
        Arrays.sort(numbers);
        int answer = count % 2 == 0 ? numbers[0]*numbers[numbers.length-1] : numbers[(numbers.length-1)/2]*numbers[(numbers.length-1)/2];
        
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}