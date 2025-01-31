import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int count = Integer.parseInt(br.readLine());
        PriorityQueue<Point> pq = new PriorityQueue<>(new PriorityQueue<>((point1, point2) -> {
            if (point1.y != point2.y) return Integer.compare(point1.y, point2.y);
            return Integer.compare(point1.x, point2.x);
        }));
        
        for(int i = 0; i < count; i++){
            String[] array = br.readLine().split(" ");
            pq.offer(new Point(Integer.parseInt(array[0]), Integer.parseInt(array[1])));
        }
        while(!pq.isEmpty()){
            Point point = pq.poll();
            bw.write(point.x +" " + point.y + "\n");
        }
        bw.flush();
        bw.close();
    }
}

class Point{
    int x;
    int y;
    
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    } 
}