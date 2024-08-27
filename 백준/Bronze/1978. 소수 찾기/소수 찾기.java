import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count =0;
        br.readLine();
        String[] array = br.readLine().split(" ");
        for(int a = 0; a<array.length;a++){
            int num = Integer.parseInt(array[a]);
            if(num == 1){
            }else if(num == 2){
                count++;
            }else{
                count += findPrimeNumber(num) ? 1 : 0;
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
    
    public static boolean findPrimeNumber(int number){
        for(int i = 2; i <= number-1;i++){
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}