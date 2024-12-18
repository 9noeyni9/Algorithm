import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int answer = 0;
        int standard = 0;
        for(int i = 0; i < 4; i++){
            String[] array = br.readLine().split(" ");
            standard = standard - Integer.parseInt(array[0]) + Integer.parseInt(array[1]);
            answer = Math.max(answer, standard);
        }
        br.close();
        
        bw.write(answer +"\n");
        bw.flush();
        bw.close();
    }
}