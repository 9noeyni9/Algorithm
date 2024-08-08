import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            int numberA = scanner.nextInt();
            int numberB = scanner.nextInt();

            System.out.println(numberA + numberB);
        }
        
        scanner.close();
    }
}