import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int record = 0;
        record = scan.nextInt();
        
        if(record >= 90 && record <= 100)
            System.out.println('A');
        else if(record >= 80 && record <=89)
            System.out.println('B');
        else if(record >= 70 && record <= 79)
            System.out.println('C');
        else if(record >= 60 && record <= 69)
            System.out.println('D');
        else 
            System.out.println('F');
    }
}