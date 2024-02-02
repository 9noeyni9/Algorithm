import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        int numDividedFour = scanner.nextInt();
        
        String[] longArray = new String[numDividedFour/4];
        for(int i=0;i < longArray.length-1;i++){
            longArray[i] = "long";
        }
        
        longArray[longArray.length-1] = "long int";
        String result = String.join(" ",longArray);
        System.out.println(result);
    }
}