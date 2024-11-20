import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double total = 0.0;
        double sum = 0.0;
        for(int i = 0; i < 20; i++){
            String[] array = br.readLine().split(" ");
            double number = Double.parseDouble(array[1]);
            double subject = 0.0;
            
            if(array[2].equals("P")){
                continue;
            }
            switch(array[2]) {
                case "A+": subject = 4.5; break;
                case "A0": subject = 4.0; break;
                case "B+": subject = 3.5; break;
                case "B0": subject = 3.0; break;
                case "C+": subject = 2.5; break;
                case "C0": subject = 2.0; break;
                case "D+": subject = 1.5; break;
                case "D0": subject = 1.0; break;
                case "F": subject = 0.0; break;
            }
            
            total += subject * number;
            sum += number;
        }
        
        bw.write(total / sum + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}