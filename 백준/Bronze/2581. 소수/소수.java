import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> list = new ArrayList<>();
        
        int min = Integer.parseInt(br.readLine());
        int max = Integer.parseInt(br.readLine());
        int sum =0;
        
        for(int i = min; i <= max; i++){
            if(i == 1){
                continue;
            }
            sum += findPrimeNumber(i,list);
        }
        
        if(list.size() == 0){
            bw.write((-1)+"\n");
            bw.flush();
            bw.close();
            return;
        } 
        Collections.sort(list);
        bw.write(sum + "\n");
        bw.write(list.get(0) + "\n");
        bw.flush();
        bw.close();
    }
    
    public static int findPrimeNumber(int num, List list) {
        int answer = 0;
        if(num == 2){
            list.add(num);
            answer = num;
        }else{
            for(int j = 2; j < num; j++){
                if(num % j == 0){
                    return 0;
                }
            }
            list.add(num);
            answer = num;
        }
        
        return answer;
    }
}