import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] array = br.readLine().split(" ");
        int n = Integer.parseInt(array[0]);
        int m = Integer.parseInt(array[1]);
        
        br.close();
        
        bw.write((n*m-1) + "\n");
        bw.flush();
        bw.close();
    }
}