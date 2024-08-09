import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] register = new int[30];
        for(int i = 0; i < register.length-2;i++){
            int studentNumber = Integer.parseInt(br.readLine());
            register[studentNumber-1] = 1;
        }
        
        for(int j = 0 ; j < 30 ; j++) {
            if(register[j] != 1){
                bw.write((j+1) + "\n");
            }
        }
        
        bw.flush();
        bw.close();
    }
}