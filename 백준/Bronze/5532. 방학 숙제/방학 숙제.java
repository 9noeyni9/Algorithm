import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int vacation = Integer.parseInt(br.readLine());
        
        int korean = Integer.parseInt(br.readLine());
        int math = Integer.parseInt(br.readLine());
        
        int koreanPage = Integer.parseInt(br.readLine());
        int mathPage = Integer.parseInt(br.readLine());
        
        br.close();
        
        int day = korean % koreanPage != 0 ? korean / koreanPage +1 : korean / koreanPage;
        day = Math.max(day, math % mathPage != 0 ? math / mathPage +1 : math / mathPage);
        
        bw.write((vacation - day) + "\n");
        bw.flush();
        bw.close();
    }
}