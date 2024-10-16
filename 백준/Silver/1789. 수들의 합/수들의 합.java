import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        long input = Long.parseLong(br.readLine());
        long number = 1;
        
        br.close();
        
        while(true){
            input -= number; 
            
            if(input < 0)
                break;
            
            number++;
        }        
        
        bw.write((number-1) + "\n");
        bw.flush();
        bw.close();
    }
}