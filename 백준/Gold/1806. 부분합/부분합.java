import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] array = br.readLine().split(" ");
        int size = Integer.parseInt(array[0]);
        int answer = Integer.parseInt(array[1]);
        
        String[] inputArray = br.readLine().split(" ");
        br.close();
        
        long[] prefixArray = new long[size+1];
        long prefixSum = 0L;
        for(int i = 0; i < inputArray.length; i++){
            prefixSum += Integer.parseInt(inputArray[i]);
            prefixArray[i+1] = prefixSum;
        }
        
        long minLength = prefixArray.length+1;
        
        int startPoint = 0;
        int endPoint = 0;
        while(endPoint <= size) {
            long partitialSum = prefixArray[endPoint] - prefixArray[startPoint];
            
            if(partitialSum == answer) {
                minLength = Math.min(minLength, endPoint - startPoint);
                endPoint++;
                startPoint++;
            }else if(partitialSum < answer){
                endPoint++;
            }else {
                minLength = Math.min(minLength, endPoint - startPoint);
                startPoint++;
            }
        }
        
        minLength = minLength == prefixArray.length+1 ? 0 : minLength;
        
        bw.write(minLength + "\n");
        bw.flush();
        bw.close();
    }
}