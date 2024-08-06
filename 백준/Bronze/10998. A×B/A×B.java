import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] numbers = reader.readLine().split(" ");
        
        writer.write(Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1])+"\n");  
        writer.flush(); 
        writer.close();
        
    }
}