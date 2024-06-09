import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        
        int count = scanner.nextInt();
        for(int i = 0; i < count; i++){
            int least = scanner.nextInt();
            System.out.println((least / quarter) + " "+ (least % quarter) / dime + " "
                              + (least % quarter) % dime / nickel + " "+ (least % quarter) % dime % nickel);
        }
    }
}