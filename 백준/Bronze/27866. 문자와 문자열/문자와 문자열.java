import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        String S = scanner.nextLine();
        int i = scanner.nextInt();
        
        String[] charArray = S.split("");
        System.out.println(charArray[i-1]);
    }
}