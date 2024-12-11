import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] arrayA = br.readLine().split(" ");
        String[] arrayB = br.readLine().split(" ");
        
        br.close();
        
        int sumA = 0;
        int sumB = 0;
        for(int i = 0; i < arrayA.length; i++){
            sumA += Integer.parseInt(arrayA[i]);
            sumB += Integer.parseInt(arrayB[i]);
        }
        
        bw.write(Math.max(sumA, sumB) + "\n");
        bw.flush();
        bw.close();
    }
}