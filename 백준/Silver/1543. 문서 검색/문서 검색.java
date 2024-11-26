import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String document = br.readLine();
        int beforeSize = document.length();
        
        String keyword = br.readLine();
        int keywordLength = keyword.length();
        
        br.close();
        
        document = document.replace(keyword, "");
        int afterSize = document.length();
        
        int result = (beforeSize - afterSize) / keywordLength;
        
        bw.write(result +"\n");
        bw.flush();
        bw.close();
    }
}