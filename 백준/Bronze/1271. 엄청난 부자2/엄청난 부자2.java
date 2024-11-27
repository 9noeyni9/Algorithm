import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] array = br.readLine().split(" ");
        br.close();
        
        BigInteger totalMoney = new BigInteger(array[0]);
        BigInteger count = new BigInteger(array[1]);
        
        bw.write(totalMoney.divide(count) + "\n");
        bw.write(totalMoney.remainder(count) + "\n");
        bw.flush();
        bw.close();
    }
}