import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        for(int i = 0; i < 3; i++){
            int count = Integer.parseInt(br.readLine());
            BigInteger sum = BigInteger.ZERO;
            for(int j = 0; j < count; j++){
                BigInteger number = new BigInteger(br.readLine());
                sum= sum.add(number);
            }
            String result = sum.compareTo(BigInteger.ZERO) == 1 ? "+" : (sum.compareTo(BigInteger.ZERO) == -1 ? "-" : "0");
            bw.write(result + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}