import java.util.*;

class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        for(int i = 0; i < schedules.length; i++) {
            int[] numbers = new int[5];
            int count = 0;
            schedules[i] = schedules[i] + 10;
            int calcSchedules = calcTime(schedules[i]);
            for(int j = 0; j < timelogs[i].length; j++) {
                int compareNumber1 = 7 - startday;
                int compareNumber2 = compareNumber1 -1;
                if(compareNumber2 < 0) {
                    compareNumber2 += 7;
                }
                if(j == compareNumber1 || j == compareNumber2){
                    continue;                    
                }
                if(timelogs[i][j] <= calcSchedules) count++;                
            }
            
            if(count == 5) answer++;
        }
        return answer;
    }
    
    private int calcTime(int time) {
        int hour = time / 100;
        int minute = time % 100;
        if(minute >= 60) {
            minute -= 60;
            hour += 1;
        }
        
        if(hour >= 24) {
            hour -= 24;
        }
        
        return hour * 100 + minute;
    }
}