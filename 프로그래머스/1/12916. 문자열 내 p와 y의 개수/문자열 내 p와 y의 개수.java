class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String change = s.toLowerCase();
        
        int p = 0;
        int y = 0;
        for (int i=0; i < change.length();i++) {
            if (change.charAt(i) == 'p') { 
                p +=1;
            }
            else if (change.charAt(i) == 'y') {
                y +=1;
            }
            
            
        }
        
        if (p == y) {
            answer = true;
        }
        
        else if (p ==0 && y ==0) {
            answer = true;
        }
        else {
            answer = false;
        }

        return answer;
    }
}