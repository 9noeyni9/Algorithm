import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int number = Integer.parseInt(br.readLine());
        
        String[] array = br.readLine().split(" ");
        
        br.close();
        
        int check = 0;
        for(int i = 0; i < array.length; i++){
            if(number == Integer.parseInt(array[i])) {
                check++;
            }
        }
        
        bw.write(check + "\n");
        bw.flush();
        bw.close();
    }
}