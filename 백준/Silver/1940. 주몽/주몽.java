import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int size = Integer.parseInt(br.readLine());
        int answer = Integer.parseInt(br.readLine());
        
        String[] array = br.readLine().split(" ");
        br.close();
        
        int[] numbers = new int[size];
        
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(array[i]);
        }
        
        Arrays.sort(numbers);
        
        int startPoint = 0;
        int endPoint = numbers.length - 1;
        int count = 0;
        
        while(startPoint < endPoint){
            int sum = numbers[startPoint] + numbers[endPoint];
            if(sum == answer){
                count++;
                startPoint++;
                endPoint--;
            }else if(sum < answer) {
                startPoint++;
            }else {
                endPoint--;
            }
        }
        
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}