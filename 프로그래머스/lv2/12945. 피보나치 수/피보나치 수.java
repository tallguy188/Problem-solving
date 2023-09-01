import java.util.*;

// 재귀함수로 풀기 f(n) = f(n-1)+f(n-2) = f(n-2)+f(n-3)+f(n-3)+f(n-4)


class Solution {
    public long solution(int n) {
        long answer = 0;
        
        long [] arr = new long[n+1];
        
        
        arr[0] = 0;
        arr[1] = 1;
        
        for(int i=2; i<=n ; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            
            arr[i]%=1234567;
        }
        
        long result = 0;
        
        
        
        answer = arr[arr.length-1];
        
        
        return answer;
    }
}