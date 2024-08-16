import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        for(int i = 0; i < array.length;i++){
            array[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(array);
        
        for(int j = 0; j < array.length;j++){
            bw.write(array[j] + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}