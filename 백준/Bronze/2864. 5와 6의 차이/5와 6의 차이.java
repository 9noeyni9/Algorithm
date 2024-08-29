import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] array = br.readLine().split(" ");
        
        String minFirstNumber = array[0].replace("6","5");
        String maxFirstNumber = array[0].replace("5","6");
        
        String minSecondNumber = array[1].replace("6","5");
        String maxSecondNumber = array[1].replace("5","6");
        
        int minNumber = Integer.parseInt(minFirstNumber) + Integer.parseInt(minSecondNumber);
        int maxNumber = Integer.parseInt(maxFirstNumber) + Integer.parseInt(maxSecondNumber);
        
        bw.write(minNumber + " " + maxNumber + "\n");
        bw.flush();
        bw.close();
    }
}