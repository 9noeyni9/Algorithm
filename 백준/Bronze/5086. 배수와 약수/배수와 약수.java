import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true){
            String[] array = br.readLine().split(" ");
            int firstNumber = Integer.parseInt(array[0]);
            int secondNumber = Integer.parseInt(array[1]);
            
            String solution = "";
            
            if(firstNumber == 0 && secondNumber == 0){
                break;
            }
            
            solution = firstNumber % secondNumber == 0 ? "multiple" : (secondNumber % firstNumber == 0 ? "factor" : "neither");
            
            bw.write(solution + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}