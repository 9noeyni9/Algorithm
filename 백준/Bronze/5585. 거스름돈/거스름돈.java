import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int change = 1000 - Integer.parseInt(br.readLine());
        
        int[] money = {500, 100, 50, 10, 5, 1};
        
        int count = 0;
        for(int i = 0; i < money.length; i++){
            if(change == 0){
                break;
            }
            count += change / money[i];
            change %= money[i]; 
        }
        
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}