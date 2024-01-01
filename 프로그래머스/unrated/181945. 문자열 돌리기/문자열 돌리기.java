import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] str = a.split("");
        for(String value : str)
            System.out.println(value);
    }
}