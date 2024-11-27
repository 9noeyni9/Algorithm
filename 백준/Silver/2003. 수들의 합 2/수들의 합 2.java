import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] array = br.readLine().split(" ");
        int size = Integer.parseInt(array[0]);
        int sum = Integer.parseInt(array[1]);
        
        int[] numbers = new int[size];
        String[] arrayNum = br.readLine().split(" ");
        for(int i = 0; i < arrayNum.length; i++) {
            numbers[i] = Integer.parseInt(arrayNum[i]);
        }
        
        br.close();
        
        int result =0;
        
        for(int j = 0; j < numbers.length; j++){
            int copy = sum; 
            int k = j;
            while(true){
                if(copy == 0) {
                    result++;
                    break;
                }
                
                if(copy < 0 || k > numbers.length-1){
                    break;
                }
                copy -= numbers[k];
                k++;
            }
        }
        
        bw.write(result +"\n");
        bw.flush();
        bw.close();
    }
}