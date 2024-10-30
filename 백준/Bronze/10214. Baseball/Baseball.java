import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int testCase = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < testCase; i++){
            int yonseiNumber = 0;
            int koreaNumber = 0;
            for(int j = 0; j < 9; j++){
                String[] array = br.readLine().split(" ");
                yonseiNumber += Integer.parseInt(array[0]);
                koreaNumber += Integer.parseInt(array[1]);
            }
            String solution = yonseiNumber > koreaNumber ? "Yonsei" : yonseiNumber < koreaNumber ? "Korea" : "Draw";
            bw.write(solution + "\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}