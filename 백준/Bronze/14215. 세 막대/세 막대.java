import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int solution = 0;
        
        String[] array = br.readLine().split(" ");
        int[] triangle = new int[3];
        
        for(int i = 0; i < triangle.length;i++){
            triangle[i] = Integer.parseInt(array[i]);
        }
        
        Arrays.sort(triangle);
        
        if(triangle[0] + triangle[1] > triangle[2]){
            solution = triangle[0] + triangle[1] + triangle[2];
        }else{
            solution = (triangle[0] + triangle[1])*2 -1;
        }
        
        bw.write(solution + "\n");
        bw.flush();
        bw.close();
    }
}