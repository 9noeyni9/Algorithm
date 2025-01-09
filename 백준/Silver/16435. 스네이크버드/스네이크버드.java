import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] input = br.readLine().split(" ");
        int size = Integer.parseInt(input[0]);
        int length = Integer.parseInt(input[1]);
        
        String[] array = br.readLine().split(" ");
        int[] fruitsOfLength = new int[size];
        for(int i = 0; i < array.length; i++){
            fruitsOfLength[i] = Integer.parseInt(array[i]);
        }
        br.close();
        
        Arrays.sort(fruitsOfLength);
        
        for(int j = 0; j < fruitsOfLength.length; j++){
            if(fruitsOfLength[j] > length){
                break;
            }
            length += fruitsOfLength[j] <= length ? 1 : 0; 
        }
        
        bw.write(length + "\n");
        bw.flush();
        bw.close();
    }
}