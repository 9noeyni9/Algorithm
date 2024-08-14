import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true){
            String[] array = br.readLine().split(" ");
            int[] numbers = new int[3];
            
            numbers[0] = Integer.parseInt(array[0]);
            numbers[1] = Integer.parseInt(array[1]);
            numbers[2] = Integer.parseInt(array[2]);
            if(numbers[0] == 0 && numbers[1]==0 && numbers[2]==0){
                break;
            }
            
            Arrays.sort(numbers);
            
            String solution = numbers[2]*numbers[2] == (numbers[0]*numbers[0] + numbers[1]*numbers[1]) ? "right":"wrong";
            
            bw.write(solution +"\n");
        }
        
        bw.flush();
        bw.close();
    }
}