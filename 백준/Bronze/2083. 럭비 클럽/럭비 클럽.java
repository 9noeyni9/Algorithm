import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        while(true){
            String str = br.readLine();
            if(str.equals("# 0 0")){
                break;
            }
            String[] input = str.split(" ");
            
            int age = Integer.parseInt(input[1]);
            int weight = Integer.parseInt(input[2]);
            
            sb.append(input[0]).append(" ");
            String output = age > 17 || weight >= 80 ? "Senior" : "Junior";
            sb.append(output).append("\n");
        }
        
        br.close();
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}