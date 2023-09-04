import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int index = 0;
        
        Arrays.sort(people);
        
        for(int i = people.length -1; i>= index; i--) {
            
            if(people[index] + people[i] <=limit) {
                answer+=1;
                index+=1;
            }
            
            else{
                answer+=1;
            }
        }
   
        return answer;
    }
}