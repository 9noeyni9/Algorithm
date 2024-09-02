import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int count = Integer.parseInt(br.readLine());
        for(int i = 0; i < count; i++){
            bw.write(calculateValue(br.readLine()) + "\n");
        }
        
        bw.flush();
        bw.close();
    }
    
    private static String calculateValue(String str){
        int sum = 0;
        double average = 0;
        double number = 0;
        String[] array = str.split(" ");
        int[] students = new int[array.length-1];
        int personnel = Integer.parseInt(array[0]);
        
        for(int j = 1; j < array.length; j++){
            students[j-1] = Integer.parseInt(array[j]);
            sum += Integer.parseInt(array[j]);
        }
        average = (double)sum / personnel;
        
        for(int k = 0; k < students.length; k++){
            number += students[k] > average ? 1 : 0;
        }
        
        return String.format("%.3f%%", (float) number / personnel * 100);
    }
}