import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuilder sb = new StringBuilder();
        
        int count = Integer.parseInt(br.readLine());
        
        for(int i =0; i < count; i++){
            String checkPassword = br.readLine();
            String result = checkPassword.length() >= 6 && checkPassword.length() <= 9 ? "yes" :"no";
            sb.append(result).append("\n");
        }
        
        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
    }
}