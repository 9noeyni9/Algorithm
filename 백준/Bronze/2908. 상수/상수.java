import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String[] array = reader.readLine().split(" ");
        
        StringBuffer buffer1 = new StringBuffer(array[0]);        
        String reverse1 = buffer1.reverse().toString();
        
        StringBuffer buffer2 = new StringBuffer(array[1]);        
        String reverse2 = buffer2.reverse().toString();
        
        int result = Integer.parseInt(reverse1) > Integer.parseInt(reverse2) ? Integer.parseInt(reverse1) : Integer.parseInt(reverse2);
        
        System.out.println(result);
    }
}