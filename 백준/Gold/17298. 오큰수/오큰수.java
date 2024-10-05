import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int count = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int[] numbers = new int[arr.length];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(arr[i]);
        }
        br.close();
        
        Stack<Integer> stack = new Stack<Integer>();
        for(int j = 0; j < numbers.length; j++){
            while(!stack.isEmpty() && numbers[stack.peek()] < numbers[j]){
                numbers[stack.pop()] = numbers[j];
            }
            stack.push(j);
        }
        
        while(!stack.isEmpty()){
            numbers[stack.pop()] = -1;
        }
        
        for(int k = 0; k < numbers.length; k++){
            bw.write(numbers[k] + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}