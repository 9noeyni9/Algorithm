import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        TreeSet<Integer> set = new TreeSet<>();
        
        String[] input = br.readLine().split(" ");
        
        String[] arrayA = br.readLine().split(" ");
        for(int i = 0; i < arrayA.length; i++){
            set.add(Integer.parseInt(arrayA[i]));
        }
        
        String[] arrayB = br.readLine().split(" ");
        for(int j = 0; j < arrayB.length; j++){
            int number = Integer.parseInt(arrayB[j]);
            if(set.contains(number)){
                set.remove(number);
            }
        }
        br.close();
        
        bw.write(set.size()+"\n");
        for (Integer num : set) {
            bw.write(num + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}