import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int subjectNum = Integer.parseInt(br.readLine());
        String[] array = br.readLine().split(" ");
        int[] scores = new int[array.length];
        int sum = 0;
        for(int i = 0; i < scores.length; i++){
            scores[i] = Integer.parseInt(array[i]);
            sum += scores[i];
        }
        
        Arrays.sort(scores);
        
        bw.write(((((double)(sum)/ scores[subjectNum-1]) *100 ) / subjectNum) +"\n");
        
        bw.flush();
        bw.close();
        br.close();
    }
}