import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int size = Integer.parseInt(br.readLine());
        br.close();
        
        int[] sumOfNumbers = new int[size+1];
        int number = 0;
        for(int i = 1; i <= size; i++) {
            number += i;
            sumOfNumbers[i] = number;
        }
            
        int startPoint = 0;
        int endPoint = 1;
        int count = 0;
        while(endPoint <= size) {
            int sum = sumOfNumbers[endPoint] - sumOfNumbers[startPoint];
            if(sum < size) {
                endPoint++;
            }else if(sum > size) {
                startPoint++;
            }else{
                count++;
                endPoint++;
                startPoint++;
            }
        }
        
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}