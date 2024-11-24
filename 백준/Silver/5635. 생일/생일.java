import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer, String> map = new HashMap<>();
        
        int count = Integer.parseInt(br.readLine());
        int[] birth = new int[count];
        
        for(int i = 0; i < count; i++){
            String[] array = br.readLine().split(" ");
            array[1] = array[1].length() == 1 ? "0"+array[1]: array[1];
            array[2] = array[2].length() == 1 ? "0"+array[2]: array[2];
            
            int date = Integer.parseInt(array[3] + array[2] + array[1]);
            
            map.put(date,array[0]);
            birth[i] = date;
        }
        
        Arrays.sort(birth);
        br.close();
        bw.write(map.get(birth[count-1]) + "\n");
        bw.write(map.get(birth[0])+"\n");
        bw.flush();
        bw.close();
    }
}