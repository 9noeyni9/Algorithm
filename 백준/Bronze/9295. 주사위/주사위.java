import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int count = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= count; i++){
            String[] array = br.readLine().split(" ");
            bw.write("Case " + i +": " +(Integer.parseInt(array[0]) + Integer.parseInt(array[1])) + "\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}