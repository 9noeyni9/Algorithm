import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        HashSet<String> set = new HashSet<>();
        
        int count = Integer.parseInt(br.readLine());
        int solution = 0;
        
        for(int i = 0; i < count; i++){
            String input = br.readLine();
            if(input.equals("ENTER")){
                solution += set.size();
                set.clear();
            }else{
                set.add(input);
            }
        }
        
        solution += set.size();
        
        bw.write(solution + "\n");
        bw.flush();
        bw.close();
    }
}