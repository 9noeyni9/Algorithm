import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();
        
        String[] array = br.readLine().split(" ");
        int count = Integer.parseInt(array[0]);
        int solution = Integer.parseInt(array[1]);
        
        for(int i = 0; i < count; i++){
            String pocketmon = br.readLine();
            map.put(pocketmon, i+1);
            map2.put(i+1, pocketmon);
        }
        
        for(int j = 0; j < solution; j++){
            String question = br.readLine();
            if(question.matches("^[0-9]*$")){
                int check = Integer.parseInt(question);
                bw.write(map2.get(check)+"\n");
            }else {
                bw.write(map.get(question)+"\n");
            }
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}