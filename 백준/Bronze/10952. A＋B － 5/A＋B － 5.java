import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true){
            String[] numbers = br.readLine().split(" ");
            int numberA = Integer.parseInt(numbers[0]);
            int numberB = Integer.parseInt(numbers[1]);
            
            if(numberA == 0 && numberB == 0){
                break;
            }
            bw.write(numberA + numberB + "\n");
        }
        bw.flush();
        bw.close();
    }
}