import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuilder sb = new StringBuilder();
        
        String[] array = br.readLine().split("");
        
        br.close();
        
        Arrays.sort(array);
        
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i].equals("1")){
                break;
            }
            count++;
        }
        
        for(int j = 0; j < count/2; j++){
            sb.append("0");
        }
        
        for(int k = 0; k < (array.length -count)/2; k++){
            sb.append("1");
        }
        
        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
    }
}