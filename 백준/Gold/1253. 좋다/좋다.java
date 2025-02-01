import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int size = Integer.parseInt(br.readLine());
        String[] array = br.readLine().split(" ");
        br.close();
        int[] numbers = new int[size];
        
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(array[i]);
        }
        
        Arrays.sort(numbers);
        
        int answer = 0;
        for(int j = 0; j < numbers.length; j++){
            int startPoint = 0;
            int endPoint = numbers.length-1;
            while(true){
                if(startPoint == j) startPoint++;
                else if(endPoint == j) endPoint--;
                
                if(startPoint >= endPoint) break;
                
                if(numbers[endPoint] + numbers[startPoint] == numbers[j]){
                    answer++;
                    break;
                } else if(numbers[endPoint] + numbers[startPoint] < numbers[j]) {
                    startPoint++;
                }else {
                    endPoint--;
                }
            }
        }
        
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}