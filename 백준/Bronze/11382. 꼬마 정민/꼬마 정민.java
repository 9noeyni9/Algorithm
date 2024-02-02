import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String[] inputNumbers = buffer.readLine().split(" ");
        long[] convertNumbers = new long[3];
        long result =0;
        for(int i =0;i < 3;i++){
            convertNumbers[i] = Long.parseLong(inputNumbers[i]);
            result += convertNumbers[i];
        }
        
        System.out.println(result);
    }
}