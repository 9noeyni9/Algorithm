import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int count = Integer.parseInt(br.readLine());
        
        String[] array = br.readLine().split(" ");
        int[] days = new int[array.length];
        
        for(int i = 0; i < array.length; i++){
            days[i] = Integer.parseInt(array[i]);
        }
        
        Arrays.sort(days);
        
        int result = 0;
        int k = 1;
        for(int j = days.length -1; j >=0; j--){
            int comparison = k + days[j];
            result = Math.max(result, comparison);
            k++;
        }
        br.close();
        
        bw.write((result+1) + "\n");
        bw.flush();
        bw.close();
    }
}