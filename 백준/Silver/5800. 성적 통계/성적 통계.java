import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int count = Integer.parseInt(br.readLine());
        for(int num = 0; num < count; num++){
            String[] array = br.readLine().split(" ");
        
            int size = Integer.parseInt(array[0]);
        
            int[] numbers = new int[size];
            for(int i = 1; i <= size; i++){
                numbers[i-1] = Integer.parseInt(array[i]);
            }
        
            Arrays.sort(numbers);
            
            int largestGap = 0;
            for(int j = size-1; j >= 1; j--){
                largestGap = Math.max(largestGap, numbers[j] - numbers[j-1]);
            }
            
            bw.write("Class " + (num+1) +"\n");
            bw.write("Max " + numbers[size-1] + ", Min " + numbers[0] + ", Largest gap " +largestGap + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}