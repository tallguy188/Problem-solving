import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=0; i<scoville.length; i++) {
            queue.add(scoville[i]);
        }
        
        int mix_num = 0;
        
        
        while(queue.size() > 1 && queue.peek() < K ) {
            int first = queue.poll();
            int second = queue.poll();
            
            int mix = first + (second *2);
            
            queue.add(mix);
            mix_num ++;
        }
        
        if(queue.peek() < K) {
            return -1;
            
        }
        return mix_num;
    }
}