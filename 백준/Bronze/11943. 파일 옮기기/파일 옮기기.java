import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] arrayA = br.readLine().split(" ");
        String[] arrayB = br.readLine().split(" ");
        
        br.close();
        
        int countA = Integer.parseInt(arrayA[0]) + Integer.parseInt(arrayB[1]);
        int countB = Integer.parseInt(arrayA[1]) + Integer.parseInt(arrayB[0]);
        
        bw.write(Math.min(countA, countB) + "\n");
        bw.flush();
        bw.close();
    }
}