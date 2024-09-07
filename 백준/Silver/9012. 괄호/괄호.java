import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));    
        
        int count = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < count ; i++){
            Stack<Character> stack = new Stack<>();
            String input = br.readLine();
            
            for(int j = 0; j < input.length(); j++){
                if(input.charAt(j) == '('){
                    stack.push(input.charAt(j));
                }else {
                    if(!stack.empty()){
                        stack.pop();
                    }else{
                        stack.push(input.charAt(j));
                        break;
                    }
                }
            }
            
            if(stack.empty()){
                bw.write("YES" + "\n");
            }else {
                bw.write("NO" +"\n");
            }
        }
        
        bw.flush();
        bw.close();
    }
}