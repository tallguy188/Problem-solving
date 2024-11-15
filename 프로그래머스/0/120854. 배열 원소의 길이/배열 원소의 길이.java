import java.util.*;

class Solution {
    public ArrayList solution(String[] strlist) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<strlist.length; i++) {
            String s1 = strlist[i];
            int len = s1.length();
            list.add(len);
            
        }
        
        
        return list;
    }
}