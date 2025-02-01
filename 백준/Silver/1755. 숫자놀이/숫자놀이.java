import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String[] input = br.readLine().split(" ");
        
        int startNumber = Integer.parseInt(input[0]);
        int endNumber = Integer.parseInt(input[1]);
        
        PriorityQueue<Number> pq = new PriorityQueue<>((number1, number2) -> {
            return number1.numberToStr.compareTo(number2.numberToStr);
        });
        for(int i = startNumber; i <= endNumber; i++){
            String[] numbers = String.valueOf(i).split("");
            StringBuilder str = new StringBuilder();
            for(int j = 0; j < numbers.length; j++){
                str.append(convert(numbers[j])).append(" ");
            }
            
            pq.offer(new Number(i,str.toString()));
        }
        
        int index = 0;
        while(!pq.isEmpty()){
            Number num = pq.poll();
            sb.append(num.number).append(" ");
            index++;
            
            if(index % 10 == 0){
                bw.write(sb.toString().trim());
                bw.newLine();
                sb.setLength(0);
            }
        }
        if(sb.toString().length() > 0){
            bw.write(sb.toString().trim());
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
    
    private static String convert(String beforeNumber){
        if(beforeNumber.equals("0")) return "zero";
        else if(beforeNumber.equals("1")) return "one";
        else if(beforeNumber.equals("2")) return "two";
        else if(beforeNumber.equals("3")) return "three";
        else if(beforeNumber.equals("4")) return "four";
        else if(beforeNumber.equals("5")) return "five";
        else if(beforeNumber.equals("6")) return "six";
        else if(beforeNumber.equals("7")) return "seven";
        else if(beforeNumber.equals("8")) return "eight";
        else return "nine";
    }
}

class Number {
    int number;
    String numberToStr;
    
    public Number(int number, String numberToStr){
        this.number = number;
        this.numberToStr = numberToStr;
    }
}