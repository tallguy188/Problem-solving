import java.util.*;

class Solution {
    public ArrayList solution(int[] numbers, int num1, int num2) {
    
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=num1;i<=num2; i++) {
            answer.add(numbers[i]);
        }
        
        return answer;
    }
}