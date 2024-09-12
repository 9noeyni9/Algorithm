import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] array = br.readLine().split(" ");
        int N = Integer.parseInt(array[0]);
        int K = Integer.parseInt(array[1]);
        int[] money = new int[N];
        
        // K 보다 커지는 부분 확인하기 위한 용도
        int check = 0;
        for(int i = 0; i < N; i++){
            money[i] = Integer.parseInt(br.readLine());
            check = money[i] <= K ? i : check;
        }
        
        br.close();
        
        int count = 0;
        for(int j = check; j >=0;j--){
            if(K % money[j] == 0){
                count += K/money[j];
                break;
            }
            count += K/money[j];
            K %= money[j];
        }
        
        bw.write(count +"\n");
        bw.flush();
        bw.close();
    }
}