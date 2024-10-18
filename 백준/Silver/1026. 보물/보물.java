import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int size = Integer.parseInt(br.readLine());
        
        String[] arrayA = br.readLine().split(" ");
        String[] arrayB = br.readLine().split(" ");
        
        br.close();
        
        int[] intArrayA = new int[size];
        int[] intArrayB = new int[size];
        
        for(int i = 0; i < size; i++){
            intArrayA[i] = Integer.parseInt(arrayA[i]);
            intArrayB[i] = Integer.parseInt(arrayB[i]);
        }
        
        Arrays.sort(intArrayA);
        Arrays.sort(intArrayB);
        
        int solution = 0;
        int k = 0;
        for(int j = size-1; j >= 0; j--){
            solution += intArrayA[j] * intArrayB[k];
            k++;
        }
        
        bw.write(solution + "\n");
        bw.flush();
        bw.close();
    }
}