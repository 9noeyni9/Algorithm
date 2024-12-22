import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String[] array = br.readLine().split(" ");
        br.close();
        
        for(int i = 1; i <= Integer.parseInt(array[0]); i++){
            sb.append(String.valueOf(i));
        }
        
        int originLength = sb.toString().length();
        int newOrigin = sb.toString().replace(array[1], "").length();
        
        bw.write((originLength - newOrigin) + "\n");
        bw.flush();
        bw.close();
    }
}