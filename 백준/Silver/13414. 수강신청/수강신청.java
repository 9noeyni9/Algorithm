import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        LinkedHashSet<String> set = new LinkedHashSet<>();
    
        String[] array = br.readLine().split(" ");
        int size = Integer.parseInt(array[0]);
        int count = Integer.parseInt(array[1]);
    
        for(int i = 0; i < count; i++){
            String studentNumber = br.readLine();
            if(set.contains(studentNumber)){
                set.remove(studentNumber);
            }
            set.add(studentNumber);
        }
        
        List<String> list = new ArrayList<>(set);
        int comparison = size >= list.size() ? list.size() : size;
        for(int j = 0; j < comparison; j++){
            bw.write(list.get(j) + "\n");
        }
    
        br.close();
        bw.flush();
        bw.close();        
    }
}