import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<Integer> set = new HashSet<>();
        
        String[] input = br.readLine().split(" ");
        int numberA = Integer.parseInt(input[0]);
        int numberB = Integer.parseInt(input[1]);
        
        String[] arrayA = br.readLine().split(" ");
        for(int i = 0; i < arrayA.length; i++){
            set.add(Integer.parseInt(arrayA[i]));
        }
        
        String[] arrayB = br.readLine().split(" ");
        for(int j = 0; j < arrayB.length; j++){
            set.add(Integer.parseInt(arrayB[j]));
        }
        
        br.close();
        
        bw.write(set.size() - (numberB+numberA-set.size()) + "\n");
        bw.flush();
        bw.close();
    }
}