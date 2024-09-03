import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        String[] array = br.readLine().split(" ");
        int[] numbers = new int[array.length];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(array[i]);
        }
        
        int M = Integer.parseInt(br.readLine());
        
        for(int j = 0; j < M;j++){
            String[] input = br.readLine().split(" ");
            int startIndex = Integer.parseInt(input[0]);
            int endIndex = Integer.parseInt(input[1]);
            int sum = 0;
            for(int k = startIndex-1; k < endIndex; k++){
                sum += numbers[k];
            }
            
            bw.write(sum + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}