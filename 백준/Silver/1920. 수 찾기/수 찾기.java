import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<Integer> set = new HashSet<>();
        
        int N = Integer.parseInt(br.readLine());
        
        String[] arrayA = br.readLine().split(" ");
        for(int i = 0;i < arrayA.length;i++){
            set.add(Integer.parseInt(arrayA[i]));
        }        
        
        int M = Integer.parseInt(br.readLine());
        String[] arrayB = br.readLine().split(" ");
        
        for(int j = 0; j < arrayB.length; j++){
            int solution = set.contains(Integer.parseInt(arrayB[j])) ? 1 : 0;
            bw.write(solution + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}