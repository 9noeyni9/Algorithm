import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuilder sb = new StringBuilder();
        
        // 중복값 판단 위해 set 사용
        HashSet<String> set = new HashSet<>();
        
        String[] array = br.readLine().split(" ");
        int N = Integer.parseInt(array[0]);
        int M = Integer.parseInt(array[1]);
        
        for(int i = 0; i < N+M ; i++){
            String str = br.readLine();
            
            // set contains 메서드 이용해서 존재하면 sb 문자열에 추가 후에 공백도 추가
            if(set.contains(str)){
                sb.append(str).append(" ");
            }
            set.add(str);
        }
        
        // 듣보잡 인원이 0일 때
        if(set.size() == (N+M)){
            bw.write(0 + "\n");
            bw.flush();
            bw.close();
            return;
        }
            
        
        // 문자열 앞 뒤 공백 제거 후 배열 생성
        String[] solutions = sb.toString().trim().split(" ");
        
        // 사전 순으로 정렬
        Arrays.sort(solutions);
        
        // 배열 크기 출력
        bw.write(solutions.length + "\n");
        
        // 사전 순으로 출력
        for(int j = 0; j < solutions.length;j++){
            bw.write(solutions[j] + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}