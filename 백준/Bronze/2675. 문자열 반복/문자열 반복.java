import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < count; i++){
            String str = scanner.nextLine();
            solution(str);
            System.out.println();
        }
    }
    
    private static void solution(String str){
        String[] array = str.split(" ");
        int number = Integer.parseInt(array[0]);
        
        String[] words = array[1].split("");
        for(int a = 0; a < words.length;a++){
            for(int b = 0; b < number; b++){
                System.out.print(words[a]);
            }
        }
    }
}