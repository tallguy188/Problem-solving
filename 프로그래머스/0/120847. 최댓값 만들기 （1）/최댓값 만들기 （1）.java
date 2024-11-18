import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int max = 0;
        Arrays.sort(numbers);
        max = numbers[numbers.length-1] * numbers[numbers.length -2];
        return max;
    }
}