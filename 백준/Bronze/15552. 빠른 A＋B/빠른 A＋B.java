import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(reader.readLine());
        
        for(int i = 0; i < count; i++){
            String[] array = reader.readLine().split(" ");
            int numberA = Integer.parseInt(array[0]);
            int numberB = Integer.parseInt(array[1]);
            writer.write(numberA + numberB + "\n");
        }
        
        writer.flush();
        reader.close();
        writer.close();
    }
}