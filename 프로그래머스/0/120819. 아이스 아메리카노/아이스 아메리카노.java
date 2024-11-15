import java.util.*;

class Solution {
    public ArrayList solution(int money) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        int k = money / 5500; 
        answer.add(k);
        int last = money - (5500*k);
        answer.add(last);
        
        return answer;
    }
}