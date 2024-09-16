import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String A = br.readLine();
        int numberA = Integer.parseInt(A);
        String B = br.readLine();
        int numberB = Integer.parseInt(B);
        int numberC = Integer.parseInt(br.readLine());
        
        br.close();
        
        bw.write(numberA + numberB - numberC + "\n");
        bw.write(Integer.parseInt(A + B) - numberC + "\n");
        
        bw.flush();
        bw.close();
    }
}