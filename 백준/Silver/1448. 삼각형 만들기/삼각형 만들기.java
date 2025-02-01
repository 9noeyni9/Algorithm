import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int[] triangles = new int[N];
        
        for(int i = 0; i < N; i++){
            triangles[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        
        int sum = 0;
        Arrays.sort(triangles);
        for(int j = triangles.length-1; j >= 2; j--){
            if(triangles[j] < triangles[j-1] + triangles[j-2]){
                sum = triangles[j] + triangles[j-1]+ triangles[j-2];
                break;
            }
        }
        
        if(sum == 0) sum = -1;
        
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }
}