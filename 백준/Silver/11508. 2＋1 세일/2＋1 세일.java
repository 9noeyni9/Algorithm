import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        
        for(int i = 0; i < N; i++){
            numbers[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        
        Arrays.sort(numbers);
        
        int answer = 0;
        int index = 1;
        for(int j = numbers.length-1; j >= 0; j--){
            if(index % 3 == 0){
                index++;
                continue;
            }
            answer += numbers[j];
            index++;
        }
        
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}