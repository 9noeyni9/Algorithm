import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int count = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < count; i++){
            String answer = "";
            String[] array = br.readLine().split(" ");
            int[] triangle = new int[array.length];
            triangle[0] = Integer.parseInt(array[0]);
            triangle[1] = Integer.parseInt(array[1]);
            triangle[2] = Integer.parseInt(array[2]);
            Arrays.sort(triangle);
            
            answer = triangle[2]*triangle[2] == triangle[0]*triangle[0] + triangle[1] * triangle[1] ? "yes" : "no";
            
            bw.write("Scenario #" + (i+1) +":" + "\n");
            bw.write(answer + "\n");
            bw.write("\n");
        }
        
        bw.flush();
        bw.close();
    }
}