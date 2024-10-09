import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < num; i++){
            HashSet<Integer> set = new HashSet<>();
            StringBuilder sb = new StringBuilder();
            int a = Integer.parseInt(br.readLine());
            String[] noteA = br.readLine().split(" ");
            
            for(int j = 0; j < noteA.length; j++){
                set.add(Integer.parseInt(noteA[j]));
            }
            
            int b = Integer.parseInt(br.readLine());
            String[] noteB = br.readLine().split(" ");
            
            for(int k = 0; k < noteB.length;k++){
                int solution = set.contains(Integer.parseInt(noteB[k])) ? 1 : 0;
                sb.append(solution + "\n");
            }
            
            bw.write(sb.toString());
        }
        bw.write("\n");
        br.close();
        bw.flush();
        bw.close();
    }
}