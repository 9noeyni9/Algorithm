import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[] numbers = new int[N];
        int answer =0;
        for(int i =0;i<N;i++){
            numbers[i] = scanner.nextInt();
        }
        for(int j=0;j<numbers.length;j++){
            if(numbers[j] < X)
                System.out.print(numbers[j] + " ");
        }
    }
}