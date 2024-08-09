import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] solution = new String[2];
        solution = br.readLine().split(" ");
        
        int basketNumber = Integer.parseInt(solution[0]);
        int count = Integer.parseInt(solution[1]);
        
        int[] baskets = new int[basketNumber];
        
        for(int c = 0; c < baskets.length; c++){
            baskets[c] = c+1;
        }
        
        for(int i = 0; i < count; i++){
            solution = br.readLine().split(" ");
            int startNumber = Integer.parseInt(solution[0]);
            int finishNumber = Integer.parseInt(solution[1]);
            
            changeBasket(baskets, startNumber, finishNumber);
        }
        for(int e : baskets){
            bw.write(e + " ");
        }
        
        br.close();
        bw.flush();
        bw.close();
        
    }
    
    private static void changeBasket(int[] array, int a, int b) {
        int start = a-1;
        int end = b-1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}