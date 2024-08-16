import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] arrayA = br.readLine().split(" ");
        int N = Integer.parseInt(arrayA[0]);
        int M = Integer.parseInt(arrayA[1]);
        
        String[] arrayB = br.readLine().split(" ");
        int[] numbers = new int[arrayB.length];
        int[] sumOfNumbers = new int[numbers.length+1];
        
        int sum = 0;
        for(int i = 0; i < numbers.length;i++){
            numbers[i] = Integer.parseInt(arrayB[i]);
            sum += numbers[i];
            sumOfNumbers[i+1] = sum;
        }
        
        for(int j = 0; j < M; j++){
            String[] arrayC = br.readLine().split(" ");
            int sumOfSubArray = 0;
            int startIndex = Integer.parseInt(arrayC[0])-1;
            int endIndex = Integer.parseInt(arrayC[1])-1;
            sumOfSubArray = sumOfNumbers[endIndex+1] - sumOfNumbers[startIndex];
            
            bw.write(sumOfSubArray + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}