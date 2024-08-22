import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true){
            String[] array = br.readLine().split(" ");
            int[] triangle = new int[3];
            HashSet<Integer> set = new HashSet<>();
            String solution = "";
            
            triangle[0] = Integer.parseInt(array[0]);
            triangle[1] = Integer.parseInt(array[1]);
            triangle[2] = Integer.parseInt(array[2]);
            
            Arrays.sort(triangle);
            if(triangle[0] == 0 && triangle[1] == 0 && triangle[2] == 0){
                break;
            }
            
            if(triangle[2] >= triangle[1] + triangle[0]){
                solution = "Invalid";                
            }else{
                set.add(triangle[0]);
                set.add(triangle[1]);
                set.add(triangle[2]);
                solution = set.size() == 1 ? "Equilateral" : set.size() == 2 ? "Isosceles" : "Scalene";
            }
            
            bw.write(solution + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}