import java.io.*;
    
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        
        int count = Integer.parseInt(buffer.readLine());
        for(int i = 0; i < count; i++){
            String str = "";
            str = buffer.readLine();
            System.out.println(String.valueOf(str.charAt(0))+String.valueOf(str.charAt(str.length()-1)));
        }
    }
}