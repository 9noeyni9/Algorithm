import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> cards = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        int cardCount = Integer.parseInt(br.readLine());
        String[] array = br.readLine().split(" ");
        
        for(int i = 0; i < array.length; i++){
            int key = Integer.parseInt(array[i]);
            int value = cards.containsKey(key) ? cards.get(key) + 1: 1;
            cards.put(key, value);
        }
        
        int checkCount = Integer.parseInt(br.readLine());
        String[] arrayB = br.readLine().split(" ");
        br.close();
        
        for(int j = 0; j < arrayB.length; j++){
            int check = Integer.parseInt(arrayB[j]);
            int answer = cards.containsKey(check) ? cards.get(check) : 0;
            sb.append(answer + " ");
        }
        System.out.print(sb.toString());
    }
}