import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] arrayA = br.readLine().split(" ");
        String[] arrayB = br.readLine().split(" ");
        
        int size = Integer.parseInt(arrayA[0]);
        int length = Integer.parseInt(arrayA[1]);
        
        int[] points = new int[size];
        for(int i = 0; i < size; i++){
            points[i] = Integer.parseInt(arrayB[i]);
        }
        
        Arrays.sort(points);
        
        double savePoint = points[0] - 0.5 + length; //2.5
        int count = 1;
        for(int j = 1; j < points.length; j++){
            double check = points[j] + 0.5;
            if(check <= savePoint) {
                continue;
            }else{
                savePoint = points[j] - 0.5 + length;
                count++;
            }
        }
        
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}