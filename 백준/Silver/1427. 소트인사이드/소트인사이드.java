import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] array = br.readLine().split("");
        Arrays.sort(array,Collections.reverseOrder());
        String joinArray = String.join("", array);
        int number = Integer.parseInt(joinArray);
        
        bw.write(number + "\n");
        bw.flush();
        bw.close();
    }
}