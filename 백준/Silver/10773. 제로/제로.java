import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int K = Integer.parseInt(br.readLine());
        
        int sum = 0;
        
        for(int i = 0; i < K; i++){
            int input = Integer.parseInt(br.readLine());
            if(input == 0){
                sum -= list.get(list.size()-1);
                list.remove(list.size()-1);
            }else{
                list.add(input);
                sum += input;
            }
        }
        
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }
}