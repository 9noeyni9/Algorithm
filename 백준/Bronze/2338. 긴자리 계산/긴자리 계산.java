import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        BigInteger firstNumber = new BigInteger(br.readLine());
        BigInteger secondNumber = new BigInteger(br.readLine());
        
        br.close();
        
        bw.write(firstNumber.add(secondNumber) + "\n");
        bw.write(firstNumber.subtract(secondNumber) + "\n");
        bw.write(firstNumber.multiply(secondNumber) + "\n");
        
        bw.flush();
        bw.close();
    }
}