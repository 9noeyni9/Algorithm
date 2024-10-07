import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] numbers = br.readLine().split(" ");
        
        int numberA = Integer.parseInt(numbers[0]);
        int numberB = Integer.parseInt(numbers[1]);
        
        br.close();
        
        int resultOfGcd = gcd(Math.max(numberA,numberB), Math.min(numberA,numberB));
        bw.write(resultOfGcd +"\n");
        bw.write(numberA*numberB / resultOfGcd + "\n");
        bw.flush();
        bw.close();
    }
    public static int gcd(int m, int n){
        if(m % n == 0) return n;
        return gcd(n,m%n);
    }
}