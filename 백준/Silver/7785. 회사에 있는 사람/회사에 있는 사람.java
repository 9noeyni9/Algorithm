import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        HashSet<String> set = new HashSet<>();
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++){
            String[] array = br.readLine().split(" ");
            if(array[1].equals("enter")){
                set.add(array[0]);
            }else {
                set.remove(array[0]);
            }
        }
        ArrayList<String> list = new ArrayList<>(set);
        
        list.sort(Comparator.reverseOrder());
        
        for(int j = 0; j < list.size(); j++){
            bw.write(list.get(j) + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}