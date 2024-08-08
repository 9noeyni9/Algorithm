import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        HashSet<Integer> set = new HashSet<>();
        
        String[] numbers = reader.readLine().split(" ");
        
        int[] square = new int[numbers.length];
        int duplicateNumber = 0;
        for(int i = 0; i < square.length;i++){
            square[i] = Integer.parseInt(numbers[i]);
            duplicateNumber = set.contains(square[i]) ? square[i] : duplicateNumber;
            set.add(square[i]);
        }
        
        if(set.size() == 1){
            writer.write((10000 + duplicateNumber * 1000) + "\n");
        }
        
        if(set.size() == 2){
            writer.write((1000 + duplicateNumber * 100) + "\n");
        }
        
        if(set.size() == 3){
            Arrays.sort(square);
            writer.write((square[2] * 100) + "\n");
        }
        
        writer.flush();
        writer.close();
    }
}