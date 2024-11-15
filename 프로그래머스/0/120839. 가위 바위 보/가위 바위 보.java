import java.util.*;

class Solution {
    public String solution(String rsp) {
        
        
        ArrayList<Character> list = new ArrayList<>();
        
        char [] array = rsp.toCharArray();
        for(char c: array) {
            if(c == '2') {
                list.add('0');
            }
            else if (c =='0') list.add('5');
            else list.add('2');
        }
        StringBuilder sb = new StringBuilder();
        for(char a : list) {
            sb.append(a);
        }
        
        String answer = sb.toString();
        return answer;
    }
}