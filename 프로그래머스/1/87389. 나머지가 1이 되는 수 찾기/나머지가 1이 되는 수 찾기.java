class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int minimum = 0;
        
        for (int i=n ; i>=1; i--) {
            if (n % i == 1) {
                minimum = i;
            }
        }
        answer = minimum;
        return answer;
    }
}