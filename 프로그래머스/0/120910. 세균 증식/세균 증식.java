class Solution {
    public long solution(int n, int t) {
        long answer = n;
        
        for(int i=0; i<t; i++) {
            answer = (long)(answer * 2);
        }
        return answer;
    }
}