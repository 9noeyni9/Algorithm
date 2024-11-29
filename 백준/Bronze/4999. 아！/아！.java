import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int length = br.readLine().length();
        int resultLength = br.readLine().length();
        
        br.close();
        
        String result = length < resultLength ? "no" : "go";
        
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}