import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String pikachu = br.readLine();
        
        br.close();
        
        if(pikachu.length() == 0){
            bw.write("NO" + "\n");
            bw.flush();
            bw.close();
            return;
        }
        pikachu = pikachu.replace("pi"," ").replace("ka"," ").replace("chu"," ");
        
        pikachu = pikachu.replace(" ","");
        String result = pikachu.length() == 0 ? "YES" : "NO";
        
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}