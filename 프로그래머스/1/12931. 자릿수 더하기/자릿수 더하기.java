import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer>result  = new ArrayList<>();
        String change = Integer.toString(n);
        
        for(int i=0; i< change.length();i++) {
            String a = change.substring(i,i+1);
            int num = Integer.parseInt(a);
            result.add(num);
        }
        for(int k:result) {
            answer += k;
        }
        return answer;
    }
}