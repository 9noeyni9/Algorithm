import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int width = scanner.nextInt();
        scanner.nextLine();
        int height = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println(width * height);
    }
}