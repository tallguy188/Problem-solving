import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String binaryString = Integer.toBinaryString(n);
        int f_num = 0;
        
        for(int i= 0; i<binaryString.length();i++) {
            
            if (binaryString.charAt(i) == '1') { 
                f_num += 1;
            }   
        }
        
        while(true) {
            n+=1;
            int num =0;
            String binarySecond = Integer.toBinaryString(n);
            for (int i= 0; i<binarySecond.length();i++) {
                 if (binarySecond.charAt(i) == '1') { 
                     num +=1;
                }   
            }
            if(f_num == num) {
                
                answer = n;
                break;
            }    
        }
        return answer;
    }
}