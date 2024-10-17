import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int minNumber = 100;
        int sum = 0;
        
        for(int i = 0; i < 7; i++){
            int input = Integer.parseInt(br.readLine());
            if(input % 2 == 1){
                sum += input;
                minNumber = minNumber >= input ? input : minNumber;
            }
        }
        
        br.close();
        
        if(sum == 0){
            bw.write(-1 + "\n");
        }else {
            bw.write(sum + "\n");
            bw.write(minNumber + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}