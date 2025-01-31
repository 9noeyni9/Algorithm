import java.util.*;

class HardDisk {
    int start;
    int time;
    
    public HardDisk(int start, int time){
        this.start = start;
        this.time = time;
    }
}

class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, Comparator.comparingInt(a -> a[0]));

        PriorityQueue<HardDisk> pq = new PriorityQueue<>((hd1, hd2) -> {
            if (hd1.time != hd2.time) return Integer.compare(hd1.time, hd2.time);
            return Integer.compare(hd1.start, hd2.start);
        });

        int totalTime = 0;
        int end = 0;
        int count = 0, index = 0;

        while (count < jobs.length) {
            while (index < jobs.length && jobs[index][0] <= end) {
                pq.offer(new HardDisk(jobs[index][0], jobs[index][1]));
                index++;
            }

            if (!pq.isEmpty()) {
                HardDisk hd = pq.poll();
                end += hd.time;
                totalTime += (end - hd.start);
                count++;
            } else if (index < jobs.length) {
                end = jobs[index][0];
            }
        }

        return totalTime / jobs.length;
    }
}
