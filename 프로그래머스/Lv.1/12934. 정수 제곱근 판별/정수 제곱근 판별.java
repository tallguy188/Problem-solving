import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        // 숫자 n이 양의 정수 sqrt의 제곱이라면 sqrt+1의 제곱을 리턴
        // 아니면 -1 리턴 
        long sqrt = (long)Math.sqrt(n);
        
        return (sqrt * sqrt == n) ? (sqrt+1)*(sqrt+1) : -1;
    }
}