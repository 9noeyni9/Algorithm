import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] array = br.readLine().split(" ");
        
        br.close();
        
        int snackPrice = Integer.parseInt(array[0]);
        int count = Integer.parseInt(array[1]);
        int money = Integer.parseInt(array[2]);
        
        int solution = snackPrice * count < money ? 0 : snackPrice * count - money;
        
        bw.write(solution + "\n");
        bw.flush();
        bw.close();
    }
}