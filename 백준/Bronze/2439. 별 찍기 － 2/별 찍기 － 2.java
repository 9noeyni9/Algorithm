import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = N - i-1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}