import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        
        String[] array = buffer.readLine().split(" ");
        int[] numArray = new int[2];
        for(int i =0;i < array.length;i++){
            numArray[i] = Integer.parseInt(array[i]);
        }
        int count =0;
        for(int j =1; j <= numArray[0]; j++){
            count += numArray[0] % j == 0 ? 1 : 0;
            if(count == numArray[1]){
                System.out.println(j);
                return;
            }
        }
        System.out.println(0);
    }
}