import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuilder sb = new StringBuilder();
        
        int count = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < count; i++){
            sb.append(br.readLine().toLowerCase()).append("\n");            
        }
        
        br.close();
        
        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
    }
}