import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] array = br.readLine().split(" ");
        
        BigInteger firstNumber = new BigInteger(array[0]);
        BigInteger secondNumber = new BigInteger(array[1]);
        
        bw.write(firstNumber.add(secondNumber) +"\n");
        
        bw.flush();
        bw.close();
    }
}