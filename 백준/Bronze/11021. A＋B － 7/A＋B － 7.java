import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0; i < count; i++){
            String[] array = scanner.nextLine().split(" ");
            System.out.println("Case #"+(i+1)+": " + (Integer.parseInt(array[0]) + Integer.parseInt(array[1])));
        }
           
    }
}