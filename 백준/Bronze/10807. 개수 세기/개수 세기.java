import java.io.*;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(buffer.readLine());
        
        String[] arr = buffer.readLine().split(" ");
        int[] numbers = new int[N];
        int v = Integer.parseInt(buffer.readLine());
        int count =0;
        for(int i =0;i < arr.length;i++){
            numbers[i] = Integer.parseInt(arr[i]);
            count += numbers[i] == v ? 1 : 0;
        }
        System.out.println(count);
    }
}