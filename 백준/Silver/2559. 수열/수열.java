import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] arrayA = br.readLine().split(" ");
        int size = Integer.parseInt(arrayA[0]);
        int interval = Integer.parseInt(arrayA[1]);
        
        String[] arrayB = br.readLine().split(" ");
        br.close();
        
        int[] sumOfNumbers = new int[size+1];
        int sum = 0;
        for(int i = 0; i <arrayB.length; i++){
            sum += Integer.parseInt(arrayB[i]);
            sumOfNumbers[i+1] = sum;
        }
        
        int startPoint = 0;
        int endPoint = interval;
        int answer = sumOfNumbers[endPoint] - sumOfNumbers[startPoint];
        while(endPoint <= size) {
            answer = Math.max(answer, sumOfNumbers[endPoint] - sumOfNumbers[startPoint]);
            startPoint++;
            endPoint++;
        }
        
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}