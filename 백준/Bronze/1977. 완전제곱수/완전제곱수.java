import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        
        br.close();
        
        int sum = 0;
        int firstResult = 0;
        
        for(int i = M; i <= N; i++){
            if(Math.sqrt(i) % 1 == 0){
                if(sum == 0){
                    firstResult = i;
                }
                sum += i;
            }
        }
        
        if(sum == 0){
            bw.write(-1 + "\n");
        }else{
            bw.write(sum + "\n");
            bw.write(firstResult + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}