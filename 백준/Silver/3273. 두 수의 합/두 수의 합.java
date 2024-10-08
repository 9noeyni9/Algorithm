import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        HashSet<Integer> set = new HashSet<>();
        
        int count = Integer.parseInt(br.readLine());
        int[] numbers = new int[count];
        String[] array = br.readLine().split(" ");
        
        for(int i = 0; i < array.length; i++){
            numbers[i] = Integer.parseInt(array[i]);
            set.add(numbers[i]);
        }
        int result = Integer.parseInt(br.readLine());
        
        int solution = 0;
        for(int j = 0; j < numbers.length; j++){
            int formatNumber = result;
            
            int number = formatNumber - numbers[j];
            if(set.contains(number)){
                solution++;
            }
        }
        
        bw.write(solution/2 + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}