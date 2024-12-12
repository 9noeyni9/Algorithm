import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        ArrayList<BigInteger> list = new ArrayList<>();
        
        list.add(BigInteger.ZERO);
        list.add(BigInteger.ONE);
        
        int number = Integer.parseInt(br.readLine());
        br.close();
        
        while(true){
            if(list.size() == number+1 || number == 0) {
                break;
            }
            list.add(list.get(list.size()-1).add(list.get(list.size()-2)));
        }
        
        bw.write(list.get(number) + "\n");
        bw.flush();
        bw.close();
    }
}