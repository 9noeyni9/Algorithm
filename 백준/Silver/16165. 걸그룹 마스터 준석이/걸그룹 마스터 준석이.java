import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, String[]> map0 = new HashMap<>();
        HashMap<String, String> map1 = new HashMap<>();
        
        String[] array = br.readLine().split(" ");
        int N = Integer.parseInt(array[0]);
        int M = Integer.parseInt(array[1]);
        
        for(int i = 0; i < N; i++){
            String groupName = br.readLine();
            int total = Integer.parseInt(br.readLine());
            String[] members = new String[total];
            for(int j = 0; j < members.length; j++){
                String name = br.readLine();
                map1.put(name, groupName);
                members[j] = name;
            }
            Arrays.sort(members);
            map0.put(groupName, members);
        }
        
        for(int k = 0; k < M; k++){
            String test = br.readLine();
            String num = br.readLine();
            if(num.equals("0")){
                bw.write(printMembers(map0.get(test)));
            }else{
                bw.write(map1.get(test) + "\n");
            }
        }
        
        bw.flush();
        bw.close();
    }
    
    private static String printMembers(String[] members){
        StringBuilder sb = new StringBuilder();
        for(int a = 0; a < members.length; a++){
            sb.append(members[a]).append("\n");
        }
        return sb.toString();
    }
}