import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int factorialNumber = Integer.parseInt(br.readLine());
        
        if(factorialNumber == 0 || factorialNumber == 1){
            bw.write(1 + "\n");
            bw.flush();
            bw.close();
            return;
        }
        
        for(int i = factorialNumber-1; i >= 1;i--){
            factorialNumber *= i;
        }
        bw.write(factorialNumber + "\n");
        bw.flush();
        bw.close();
    }
}