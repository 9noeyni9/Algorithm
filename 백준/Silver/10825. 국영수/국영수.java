import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int count = Integer.parseInt(br.readLine());
        PriorityQueue<ReportCard> pq = new PriorityQueue<>((rc1, rc2) -> {
            if(rc1.koreanScore != rc2.koreanScore) return Integer.compare(rc2.koreanScore, rc1.koreanScore);
            if(rc1.englishScore != rc2.englishScore) return Integer.compare(rc1.englishScore, rc2.englishScore);
            if(rc1.mathScore != rc2.mathScore) return Integer.compare(rc2.mathScore, rc1.mathScore);
            return rc1.name.compareTo(rc2.name);
        });
        
        for(int i = 0; i < count; i++){
            String[] array = br.readLine().split(" ");
            pq.offer(new ReportCard(Integer.parseInt(array[1]), Integer.parseInt(array[2]), Integer.parseInt(array[3]), array[0]));
        }
        
        while(!pq.isEmpty()){
            ReportCard rc = pq.poll();
            bw.write(rc.name + "\n");
        }
        bw.flush();
        bw.close();
    }
}

class ReportCard {
    int koreanScore;
    int englishScore;
    int mathScore;
    String name;
    
    public ReportCard(int koreanScore, int englishScore, int mathScore, String name){
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
        this.name = name;
    }
}