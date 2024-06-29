import java.util.*;

class Main {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        int count = scanner.nextInt();
        scanner.nextLine();
        
        for(int i = 0; i < count; i++){
            list.add(scanner.nextInt());
            scanner.nextLine();
        }
        
        Collections.sort(list);
        
        for(int number : list){
            System.out.println(number);
        }
    }
}