import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int count = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i = 0; i < count; i++){
            answer += checkGroupWord(br.readLine());
        }
        
        br.close();
        bw.write(answer + "\n");
        bw.flush();
        bw.close();        
    }
    
    public static int checkGroupWord (String word) {
        StringBuilder sb = new StringBuilder();
        String[] array = word.split("");
        Arrays.sort(array);
        
        sb.append(array[0]);
        for(int j = 1; j < array.length; j++){
            if(array[j].equals(array[j-1])){
                sb.append(array[j]);
            } else {
                if(!word.contains(sb.toString())) {
                    return 0;
                } else {
                    sb = new StringBuilder();
                    sb.append(array[j]);
                    continue;
                }
            }
        }
        
        return word.contains(sb.toString()) ? 1 : 0;
    }
}