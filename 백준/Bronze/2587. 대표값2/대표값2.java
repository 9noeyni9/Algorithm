import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int sum = 0;
        for(int i = 0; i < 5; i++){
            array[i] = scanner.nextInt();
            scanner.nextLine();
            sum += array[i];
        }
        Arrays.sort(array);
        System.out.println(sum / 5);
        System.out.println(array[2]);
    }
}