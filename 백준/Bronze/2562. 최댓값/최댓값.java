import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] array = new int[9];
        int number =0;
        int max = 0;
        for(int i = 0; i < array.length; i++){
            array[i] = scan.nextInt();
            if(max < array[i]){
                max = array[i];
                number = i+1;
            } 
        }
        System.out.println(max);
        System.out.println(number);
    }
}