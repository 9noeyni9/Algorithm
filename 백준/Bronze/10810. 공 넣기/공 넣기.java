import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] arrayA = br.readLine().split(" ");
        
        int numberOfBaskets = Integer.parseInt(arrayA[0]);
        int count = Integer.parseInt(arrayA[1]);
        
        int[] baskets = new int[numberOfBaskets];
        
        for(int i = 0; i < count; i++){
            String[] arrayB = br.readLine().split(" ");
            Arrays.fill(baskets,Integer.parseInt(arrayB[0])-1,Integer.parseInt(arrayB[1]),Integer.parseInt(arrayB[2]));
        }
        
        for(int num : baskets){
            bw.write(num + " ");
        }
        
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}