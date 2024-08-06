import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] time = reader.readLine().split(" ");
        
        int H = Integer.parseInt(time[0]);
        int M = Integer.parseInt(time[1]);
        
        if(M >= 45){
            M = M -45;
        } else {
            H = H == 0? 23 : H - 1;
            M = 60 - (45 - M);
        }
        
        writer.write(H + " " + M + "\n");
        
        writer.flush();
        writer.close();
    }
}