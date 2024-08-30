import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] array = br.readLine().split(" ");
        int min = Integer.parseInt(array[0]);
        int max = Integer.parseInt(array[1]);
        if(min <= 2) {
            bw.write(2 + "\n");
        }
        
        for(int a = min; a <= max; a++){
            if(a == 1 || a % 2 == 0){
                continue;
            }
            if(findPrimeNumber(a)){
                bw.write(a + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
    
    private static boolean findPrimeNumber(int number) {
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}