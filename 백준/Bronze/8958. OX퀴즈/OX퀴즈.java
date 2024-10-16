import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int testCase = Integer.parseInt(br.readLine());
        for(int i = 0; i < testCase; i++){
            String[] answer = br.readLine().split("");
            int result = calculateScore(answer);
            bw.write(result + "\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
    
    public static int calculateScore(String[] answer){
        int totalScore = 0;
        int partialScore = 0;
        for(int j = 0; j < answer.length; j++){
            if(answer[j].equals("X")){
                partialScore = 0;
            }else{
                partialScore++;
                totalScore += partialScore;
            }
        }
        return totalScore;
    }
}