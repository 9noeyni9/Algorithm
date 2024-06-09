import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if(str.equals(" ")){
            System.out.println(0);
            return;
        }
        String[] arr = str.trim().split(" ");
        System.out.println(arr.length);
    }
}