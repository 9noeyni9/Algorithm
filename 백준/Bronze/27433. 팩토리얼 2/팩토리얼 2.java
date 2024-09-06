import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int number = Integer.parseInt(br.readLine());
        
        bw.write(factorial(number) +"\n");
        bw.flush();
        bw.close();
    }
    
    public static long factorial(int number){
        if(number <= 0){
            return 1;
        }
        return number * factorial(number-1);
    }
}