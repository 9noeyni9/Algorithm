import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] array = br.readLine().split(" ");
        int W = Integer.parseInt(array[0]);
        int H = Integer.parseInt(array[1]);
        
        double extent = ((double)(W) * H)/2;
        
        bw.write(extent + "\n");
        bw.flush();
        bw.close();
    }
}