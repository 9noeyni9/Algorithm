import java.util.*;

class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        StringBuffer buffer =  new StringBuffer(input);
        String reverse = buffer.reverse().toString();
        
        int result =0;
        result = Objects.equals(input,reverse) ? 1 : 0;
        System.out.println(result);
    }
}