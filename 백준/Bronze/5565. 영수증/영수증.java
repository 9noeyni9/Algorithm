import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int totalNumber = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < 9; i++){
            totalNumber -= Integer.parseInt(br.readLine());
        }
        
        bw.write(totalNumber+"\n");
        br.close();
        bw.flush();
        bw.close();
    }
}