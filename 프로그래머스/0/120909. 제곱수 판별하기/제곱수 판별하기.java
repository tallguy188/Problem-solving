class Solution {
    public int solution(int n) {
        int answer = 0;
        double num = Math.sqrt(n);
        if(num  == (int)num) {
            answer = 1;
        }
        else answer = 2;
        
        
        return answer;
    }
}