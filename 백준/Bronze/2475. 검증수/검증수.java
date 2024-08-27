import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] array = br.readLine().split(" ");
        int sum = 0;       
        
        for(int i = 0; i < array.length; i++){
            sum += Integer.parseInt(array[i])*Integer.parseInt(array[i]);
        }
        
        bw.write((sum % 10) + "\n");
        bw.flush();
        bw.close();
    }
}