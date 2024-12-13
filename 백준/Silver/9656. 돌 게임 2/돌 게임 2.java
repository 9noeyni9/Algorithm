import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        br.close();

        String answer = count % 2 == 0 ? "SK" : "CY";

        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}