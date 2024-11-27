import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] array = br.readLine().split(" ");
        
        br.close();
        
        int r1 = Integer.parseInt(array[0]);
        int s = Integer.parseInt(array[1]);
        
        int r2 = s * 2 - r1;
        
        bw.write(r2 + "\n");
        bw.flush();
        bw.close();
    }
}