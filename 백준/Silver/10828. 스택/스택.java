import java.io.*;

public class Main {
    
    public static int[] stack;
    public static int size = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        stack = new int[N];
        
        for(int i = 0;i < N; i++){
            String input = br.readLine();
            switch(input){
                case "pop": bw.write(pop() + "\n"); break;
                case "size": bw.write(size() + "\n");break;
                case "empty": bw.write(empty() + "\n");break;
                case "top": bw.write(top() + "\n");break;
                default: {
                        String[] arr = input.split(" ");
                        int x = Integer.parseInt(arr[1]);
                        push(x);
                    }
            }
        }
        
        bw.flush();
        bw.close();
    }
    
    public static void push(int x){
        stack[size] = x;
        size++;
    }
    
    public static int pop(){
        if(size == 0){
            return -1;
        } else {
            int result = stack[size -1];
            stack[size-1] = 0;
            size--;
            return result;
        }
    }
    
    public static int size(){
        return size == 0? 0 : size;
    }
    
    public static int empty(){
        return size == 0 ? 1 :0;
    }
    
    public static int top(){
        return size == 0 ? -1 : stack[size-1];
    }
}