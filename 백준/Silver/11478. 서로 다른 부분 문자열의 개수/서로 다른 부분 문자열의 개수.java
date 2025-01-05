import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<String> set = new HashSet<>();
        
        String str = br.readLine();
        int startIndex = 0;
        int endIndex = startIndex + 1;
        while(startIndex < str.length()){
            if(endIndex == str.length()){
                set.add(str.substring(startIndex, endIndex));
                startIndex++;
                endIndex = startIndex + 1;
            }else if(endIndex < str.length()){
                set.add(str.substring(startIndex,endIndex));
                endIndex++;
            }
        }
        
        bw.write(set.size()+"\n");
        bw.flush();
        bw.close();
    }
}