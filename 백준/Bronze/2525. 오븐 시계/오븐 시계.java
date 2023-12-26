import java.util.*;

class Main{
    public static void main(String[] args){        
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();
        int ovenTime = scan.nextInt();
        
        int result = h*60 + m + ovenTime;
        
        int hour = (result /60) %24;
        int minute = result % 60;
        
        System.out.println(hour + " " +minute);
    }
}