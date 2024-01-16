import java.util.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String k  = Integer.toString(x);
        int sum = 0;
        // 각 자릿수를 더함 
        for(int i=0; i<k.length(); i++ ) {
            sum += Character.getNumericValue(k.charAt(i));
        }
        if(x % sum == 0) {
            answer = true;
        }
        else {
            answer = false;
        }
        return answer;
    }
}