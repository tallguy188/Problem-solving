import java.util.*;
// 구간합, 완전탐색
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers); // 배열정렬
        
        answer = Math.max(numbers[numbers.length-1] * numbers[numbers.length-2], numbers[0] * numbers[1]);
        
        return answer;
    }
}