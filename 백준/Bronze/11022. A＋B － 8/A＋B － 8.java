import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer,String> map = new HashMap<>();
        
        int count = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < count; i++){
            map.put(i+1,br.readLine());
        }
        
        for(int j = 1; j <= count; j++){
            String[] array = map.get(j).split(" ");
            int[] numbers = new int[2];
            numbers[0] = Integer.parseInt(array[0]);
            numbers[1] = Integer.parseInt(array[1]);
            bw.write("Case #"+j+": "+numbers[0] +" + " + numbers[1] +" = " + (numbers[0]+numbers[1])+"\n");
        }
        
        bw.flush();
        bw.close();
    }
}