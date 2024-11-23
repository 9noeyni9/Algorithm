import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] array = br.readLine().split(" ");
        br.close();
        
        int A = Integer.parseInt(array[0]);
        int B = Integer.parseInt(array[1]);
        int N = Integer.parseInt(array[2]);
        
        int result = 0;
        
        for(int i = 0; i < N; i++){
            A = (A % B) * 10;
            result = A / B;
        }
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}