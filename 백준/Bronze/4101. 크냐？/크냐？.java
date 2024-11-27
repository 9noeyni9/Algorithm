import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuilder sb = new StringBuilder();
        
        while(true){
            String str = br.readLine();
            if(str.equals("0 0")){
                break;
            }
            String[] array = str.split(" ");
            long firstNumber = Long.parseLong(array[0]);
            long secondNumber = Long.parseLong(array[1]);
            
            String result = firstNumber > secondNumber ? "Yes" : "No";
            sb.append(result).append("\n");
        }
       
        br.close();
        bw.write(sb.toString()+"\n");
        bw.flush();
        bw.close();
    }
}