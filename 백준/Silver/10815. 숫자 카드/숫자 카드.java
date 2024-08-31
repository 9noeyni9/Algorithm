import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<Integer> set = new HashSet<>();
        
        int N = Integer.parseInt(br.readLine());
        String[] array = br.readLine().split(" ");
        
        for(int i = 0; i < array.length; i++){
            set.add(Integer.parseInt(array[i]));
        }
        
        int M = Integer.parseInt(br.readLine());
        String[] arrayM = br.readLine().split(" ");
        
        for(int j = 0; j < arrayM.length; j++){
            int answer = set.contains(Integer.parseInt(arrayM[j])) ? 1 : 0;
            bw.write(answer + " ");
        }
        
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}