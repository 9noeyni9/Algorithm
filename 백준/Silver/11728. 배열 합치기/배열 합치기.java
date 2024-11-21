import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] array = br.readLine().split(" ");
        int sizeA = Integer.parseInt(array[0]);
        int sizeB = Integer.parseInt(array[1]);
        
        int[] result = new int[sizeA + sizeB];        
        
        String[] arrayA = br.readLine().split(" ");
        String[] arrayB = br.readLine().split(" ");
        
        br.close();
        
        for(int i = 0; i < arrayA.length; i++){
            result[i] = Integer.parseInt(arrayA[i]);
        }
        
        for(int j = sizeA; j < result.length; j++){
            result[j] = Integer.parseInt(arrayB[j-sizeA]);
        }
        
        Arrays.sort(result);
        
        for(int k = 0; k < result.length; k++){
            bw.write(result[k] + " ");
        }
        
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}