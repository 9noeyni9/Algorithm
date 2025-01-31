import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int count = Integer.parseInt(br.readLine());
        PriorityQueue<Word> pq = new PriorityQueue<>((word1,word2) -> {
            if(word1.length != word2.length) return Integer.compare(word1.length, word2.length);
            return word1.str.compareTo(word2.str);
        });
        
        for(int i = 0; i < count; i++){
            String input = br.readLine();
            pq.offer(new Word(input.length(), input));
        }
        
        String check = "";
        while(!pq.isEmpty()){
            Word word = pq.poll();
            if(check.equals(word.str)){
                continue;
            }
            bw.write(word.str + "\n");
            check = word.str;
        }
        
        bw.flush();
        bw.close();
    }
}

class Word {
    int length;
    String str;
    
    public Word(int length, String str){
        this.length = length;
        this.str = str;
    }
}