import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int extent = 0;
        int N = Integer.parseInt(br.readLine());
        
        if(N == 1){
            extent = 0;
        }else{
            int[] pointA = new int[N];
            int[] pointB = new int[N];
        
            for(int i = 0; i < N; i++){
                String[] array = br.readLine().split(" ");
                pointA[i] = Integer.parseInt(array[0]);
                pointB[i] = Integer.parseInt(array[1]);
            }
        
            Arrays.sort(pointA);
            Arrays.sort(pointB);
        
            extent = (pointA[N-1] - pointA[0])*(pointB[N-1] - pointB[0]);            
        }
        
        bw.write(extent + "\n");
        bw.flush();
        bw.close();
    }
}