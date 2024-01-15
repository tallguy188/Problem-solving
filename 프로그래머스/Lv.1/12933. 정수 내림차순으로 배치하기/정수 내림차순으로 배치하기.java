import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = Long.toString(n);
        List<Integer> numbers = new ArrayList<>();
        
        for(int i=0; i<s.length();i++) {
            numbers.add(Character.getNumericValue(s.charAt(i)));
        }
        Collections.sort(numbers,Collections.reverseOrder());
        System.out.println(numbers);
        
        String result = numbers.stream().map(Object::toString).collect(Collectors.joining());
        answer = Long.parseLong(result);
        return answer;
    }
}