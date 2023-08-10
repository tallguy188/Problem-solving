import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strarr = s.split(" ");
        
        int[] iarr = new int[strarr.length];
        
        for(int i=0; i<strarr.length;i++) {
            iarr[i] = Integer.parseInt(strarr[i]);
        }
        
        Arrays.sort(iarr); 
        
        answer = iarr[0] + " " + iarr[iarr.length-1];
        return answer;
    }
}