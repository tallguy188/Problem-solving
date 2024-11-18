import java.util.*;

class Solution {
    public ArrayList solution(int[] num_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        int even = 0;
        int odd = 0;
        for(int i=0; i<num_list.length; i++){
            
            // if(num_list[i]==0) {
            //     continue;
            // }
            if(num_list[i] % 2 ==0) {
                even ++;
            }
            else odd ++;
            
        }   
        answer.add(even);
        answer.add(odd);
        return answer;
    }
}