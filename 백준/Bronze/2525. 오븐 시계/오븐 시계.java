import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] numbers = reader.readLine().split(" ");
        int hour = Integer.parseInt(numbers[0]);
        int minute = Integer.parseInt(numbers[1]);
        
        int cookTime = Integer.parseInt(reader.readLine());
        
        int cookHour = (cookTime / 60)%24;
        int cookMinute = cookTime % 60;
        
        int afterHour = 0;
        int afterMinute = 0;
               
        if(minute + cookMinute >= 60){
            cookHour++;
            afterMinute = (minute + cookMinute) % 60;
        } else {
            afterMinute = minute + cookMinute;
        }
        
        afterHour = (hour + cookHour) % 24;
        
        writer.write(afterHour + " " + afterMinute + "\n");
        writer.flush();
        writer.close();
    }
}