import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] arrayA = br.readLine().split(" ");
        
        int N = Integer.parseInt(arrayA[0]);
        int M = Integer.parseInt(arrayA[1]);
        
        int[] numbers = new int[N];
        for(int i = 1; i <= N;i++){
            numbers[i-1] = i;
        }
        
        for(int j = 0; j < M ; j++){
            String[] arrayB = br.readLine().split(" ");
            int number = numbers[Integer.parseInt(arrayB[0])-1];
            numbers[Integer.parseInt(arrayB[0])-1] = numbers[Integer.parseInt(arrayB[1]) -1];
            numbers[Integer.parseInt(arrayB[1]) -1] = number;
        }
        for(int num : numbers){
            bw.write(num + " ");
        }
        
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}