import java.io.*;

public class Main {
    
    public static int[] queue;
    public static int size = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int count = Integer.parseInt(br.readLine());
        
        queue = new int[count];
        for(int i = 0;  i < count; i++){
            String input = br.readLine();
            switch(input){
                case "pop": bw.write(pop() + "\n"); break;
                case "size": bw.write(size() +"\n"); break;
                case "empty": bw.write(empty() + "\n"); break;  
                case "front": bw.write(front() +"\n"); break;
                case "back": bw.write(back()+"\n"); break;
                    default : {
                        String[] array = input.split(" ");
                        int number = Integer.parseInt(array[1]);
                        push(number);
                    }
            }
        }
        
        bw.flush();
        bw.close();
    }
    
    public static void push(int number) {
        queue[size] = number;
        size++;
    }
    
    public static int pop() {
        if(size == 0) {
            return -1;
        } else {
            int result = queue[0];
            for(int i = 1; i < size; i++){
                int temp = queue[i];
                queue[i-1] = temp;
                queue[i] = 0;
            }
            size--;
            return result;
        }
    }
    
    public static int size() {
        return size == 0 ? 0 : size;
    }
    
    public static int empty() {
        return size == 0 ? 1:0;
    }
    
    public static int front() {
        return size != 0? queue[0] : -1;
    }
    
    public static int back() {
        return size != 0 ? queue[size-1] : -1;
    }
}