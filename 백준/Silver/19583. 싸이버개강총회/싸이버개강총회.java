import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] checkTime = br.readLine().split(" ");
        int startTime = toMinutes(checkTime[0]);   
        int endTime = toMinutes(checkTime[1]);     
        int checkEndTime = toMinutes(checkTime[2]); 

        HashSet<String> set = new HashSet<>();
        int count = 0;

        String input;
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            String[] array = input.split(" ");
            int time = toMinutes(array[0]);
            String user = array[1];

            if (time <= startTime) {
                set.add(user);
            } else if (time >= endTime && time <= checkEndTime && set.contains(user)) {
                count++;
                set.remove(user); 
            }
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

    private static int toMinutes(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
}