import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<Integer> set = new HashSet<>();
        String solution = "";
        
        int sum = 0;
        for(int i = 0; i < 3;i++){
            int angle = Integer.parseInt(br.readLine());
            set.add(angle);
            sum += angle;
        }
        
        if(sum != 180){
            solution = "Error";
        }else{
            solution = set.size() == 1 ? "Equilateral" : set.size() == 2 ? "Isosceles" : "Scalene";
        }
        
        bw.write(solution + "\n");
        bw.flush();
        bw.close();
    }
}