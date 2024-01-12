import java.util.*;

class Solution {
    public int[] solution(long n) {
        
        String original = Long.toString(n);
        StringBuilder reversed = new StringBuilder(original).reverse();
        String reverseStr = reversed.toString();
        int[] answer = new int[reverseStr.length()];
        for(int i=0; i<reverseStr.length();i++) {
            answer[i] = Integer.parseInt(reverseStr.substring(i,i+1));
        }
        
        return answer;
    }
}