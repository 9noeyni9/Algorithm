import java.io.*;

class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(buffer.readLine());
        String[] array = buffer.readLine().split("");
        int[] numbers = new int[array.length];
        int result =0;
        for(int i =0;i < N;i++){
            numbers[i] = Integer.parseInt(array[i]);
            result += numbers[i];
        }
        System.out.println(result);
    }
}