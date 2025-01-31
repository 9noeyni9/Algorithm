import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int count = Integer.parseInt(br.readLine());
        PriorityQueue<Student> pq = new PriorityQueue<>((student1, student2) -> {
            if(student1.age != student2.age) return Integer.compare(student1.age, student2.age);
            return Integer.compare(student1.id, student2.id);
        });
        
        for(int i = 0; i < count; i++){
            String[] array = br.readLine().split(" ");
            pq.offer(new Student(i, Integer.parseInt(array[0]), array[1]));
        }
        
        while(!pq.isEmpty()){
            Student student = pq.poll();
            bw.write(student.age + " " +student.name + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}

class Student {
    int id; 
    int age;
    String name;
    
    public Student(int id, int age, String name){
        this.id = id;
        this.age = age;
        this.name = name;
    }
}