import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int count = Integer.parseInt(br.readLine());
        
        String[] array = br.readLine().split("");
        
        int sum = 0;
        for(int i = 0; i < count; i++){
            int number = Integer.parseInt(array[i]);
            sum += number;
        }
        
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }
}