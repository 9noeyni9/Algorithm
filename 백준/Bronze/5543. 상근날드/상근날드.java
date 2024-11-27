import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int bugger = Integer.parseInt(br.readLine());
        for(int i = 0; i < 2; i++){
            bugger = Math.min(bugger, Integer.parseInt(br.readLine()));
        }
        
        
        int soda = Integer.parseInt(br.readLine());
        soda = Math.min(soda, Integer.parseInt(br.readLine()));
        
        br.close();
        
        bw.write((bugger + soda - 50) +"\n");
        bw.flush();
        bw.close();
    }
}