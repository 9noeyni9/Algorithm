import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String input = br.readLine();
        
        br.close();
        
        for(int i = 0; i < input.length(); i++){
            char chr = input.charAt(i);
            chr = chr >= 97 ? (char)(chr -32) : (char)(chr + 32);
            sb.append(chr);        
        }
        
        bw.write(sb.toString()+"\n");
        bw.flush();
        bw.close();
    }
}